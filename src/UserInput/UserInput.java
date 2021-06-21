package UserInput;

public class UserInput {

    public static class TextInput {

        String str = "";

        public void add(char c){
            str = str + c;
        }

        public String getValue(){
            return str;
        }
    }

    public static class NumericInput extends TextInput {

        @Override
        public void add(char c){
            if (Character.isDigit(c)){
                str = str + c;
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}