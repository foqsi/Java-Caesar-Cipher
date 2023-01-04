public class CaesarCipher{
    private int key;
    private String ShiftedText;
    private String PlainText;
    public CaesarCipher(String PlainText,int key){
        this.PlainText=PlainText;
        this.key=key;
        this.ShiftedText=this.shift();
    }
    public String  toString (){
        return this.ShiftedText;
    }
    private String shift(){
        String shiftedText="";
        for(int i=0;i<this.PlainText.length();i++){
            shiftedText+=this.shiftChar(this.PlainText.charAt(i));
        }
        return shiftedText;
    }
    private char shiftChar(char c){
        if(c>='a'&&c<='z'){
            return (char)('a'+(c-'a'+this.key)%26);
        }
        else if(c>='A'&&c<='Z'){
            return (char)('A'+(c-'A'+this.key)%26);
        }
        else{
            return c;
        }
    }
    private boolean isLetter(String letter){
        if(letter.length()==1){
            if(letter.charAt(0)>='a'&&letter.charAt(0)<='z'){
                return true;
            }
            else if(letter.charAt(0)>='A'&&letter.charAt(0)<='Z'){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    private int mathMod(int x,int n){
        return ((x%n)+n)%n;
    }
}