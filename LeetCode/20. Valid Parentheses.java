
public boolean isValid(String s) {
       Stack<Character> leftSymbols = new Stack<>();
        for(char bracket:s.toCharArray()){
            if (bracket == '(' || bracket == '{' || bracket =='[') {
                leftSymbols.push(bracket);
            } else if (bracket==')' && !leftSymbols.isEmpty()  &&  leftSymbols.peek()=='('){
                leftSymbols.pop();
            }
            else if (bracket==']' && !leftSymbols.isEmpty()  && leftSymbols.peek()=='['){
                leftSymbols.pop();
            }
            else if (bracket=='}' && !leftSymbols.isEmpty()  && leftSymbols.peek()=='{'){
                leftSymbols.pop();
            }else{
                return false;
            }
        }
        return leftSymbols.isEmpty();
 
    }
