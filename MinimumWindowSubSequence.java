public class MinimumWindowSubSequence {

        public static String minWindow(String str1, String str2) {
            int sizeStr1 = str1.length();
            int sizeStr2 = str2.length();
            int length = Integer.MAX_VALUE;
            int indexStr1 = 0;
            int indexStr2 = 0;
            int windowStart = 0, windowEnd = 0;
            String minSubsequence = "";

            while (indexStr1 < sizeStr1) {

                if (str1.charAt(indexStr1) == str2.charAt(indexStr2)) {
                    indexStr2++;

                    if (indexStr2 == sizeStr2) {

                        windowStart = indexStr1;
                        windowEnd = indexStr1;
                        indexStr2--;


                        while (indexStr2 >= 0) {
                            if (str1.charAt(windowStart) == str2.charAt(indexStr2)) {
                                indexStr2--;
                            }
                            windowStart--;
                        }
                        windowStart++;


                        if ((windowEnd - windowStart + 1) < length) {
                            length = windowEnd - windowStart + 1;
                            minSubsequence = str1.substring(windowStart, windowEnd + 1);
                        }


                        indexStr1 = windowStart;
                        indexStr2 = 0;
                    }
                }
                indexStr1++;
            }


            return minSubsequence;
        }

        public static void main(String[] args) {
            String str1 = "abcdbebe";
            String str2 = "bbe";
            System.out.println(minWindow(str1, str2));
        }
    }


