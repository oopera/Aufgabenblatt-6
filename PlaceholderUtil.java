package de.hrw.progra2.assignment6;

import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static de.hrw.progra2.assignment6.Placeholder.*;


/**
 * Utility class for placeholder replacement.
 */
public class PlaceholderUtil{
    /**
     * Replaces all placeholders in string that have format ${placeholder}. The detectable
     * placeholders are enumerated in enum Placeholder. If placeholder is not found in
     * enum Placeholder, "<unknown>" shall be inserted.
     * @param text
     * @return text with replaced placeholders
     */
    public static String replaceAllPlaceholders(String text)throws Exception {

            String regex = "\\$\\{([^}]+)\\}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            String result = text;

            while(matcher.find()) {
                String token = matcher.group();
                String tokenKey = matcher.group(1);
                Placeholder replacementValue = null;

                if (result.contains(token)) {
                  if (tokenKey.equals("TEAM_ID")) {
                        replacementValue = TEAM_ID;
                        result = result.replaceFirst(Pattern.quote(token), TEAM_ID.getReplacementText());
                    } else if (tokenKey.equals("PROJECT_ID")) {
                        replacementValue = PROJECT_ID;
                        result = result.replaceFirst(Pattern.quote(token), PROJECT_ID.getReplacementText());
                    } else if (tokenKey.equals("TEAM_LEAD")) {
                        replacementValue = TEAM_LEAD;
                        result = result.replaceFirst(Pattern.quote(token), TEAM_LEAD.getReplacementText());
                    } else if(tokenKey != "TEAM_LEAD" && tokenKey != "TEAM_ID" && tokenKey != "TEAM_LEAD") {
                      result = result.replaceFirst(Pattern.quote(token), "<nothing>");
                    } else {
                      throw new RuntimeException("String contained an unsupported token.");
                  }
                }
            }
        System.out.println(result);
            return result;
        }

        public static void main(String[] args) throws Exception {
            replaceAllPlaceholders("Team ${TEAM_ID} starts project ${PROJECT_ID} with lead ${TEAM_LEAD} on ${DATE}.");

        }
    }




