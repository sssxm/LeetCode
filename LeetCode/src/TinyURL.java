import java.util.Scanner;

public class TinyURL {
	
	public static void main(String[] arg){
		
	}
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        Scanner scanner = new Scanner(longUrl);
        scanner.useDelimiter("/");
        String s = scanner.next();
        s += "//";
        scanner.close();
        return s;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return "hhh";
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));