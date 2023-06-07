public String longestCommonPrefix(String[] strs) {
         if (strs.length == 0) return "";
        StringBuilder resultString = new StringBuilder();
        String shortestString = String.valueOf(Arrays.stream(strs)
        .min(Comparator.comparing(String::length)).get());
        int minimumLength =shortestString.length();
        for(int i=0;i<minimumLength;i++){
            char current = shortestString.charAt(i);
            for(String st:strs){
                if(st.charAt(i)!=current){
                    System.out.println("rejecting"+current);
                   return resultString.toString();
                }

            }
            resultString.append(current);

        }
        return resultString.toString();
    }
