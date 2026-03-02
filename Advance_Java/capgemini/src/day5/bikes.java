package day5;
import java.util.Scanner;
public class bikes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to know about which bike you want to know");
		char key;
		do {
			System.out.println("press\n1 for Yamaha YZF-R15 V4\n2 for TVS Apache RR 310\n3 for BMW G 310 RR\n4 for Bajaj Pulsar RS 200\n5 for Suzuki Gixxer SF 250");
			int a = sc.nextInt();
			switch(a) {
				case 1:
					System.out.println("                               :b                                                \r\n"
							+ "                  .'\\          $$                                                \r\n"
							+ "                 /   ;         :P                                                \r\n"
							+ "                /   ,;         ;`                                                \r\n"
							+ "               /_.-\" L        _:_                                                \r\n"
							+ "              :\"      \\      ;  .j-.                                             \r\n"
							+ "              ;   _    ; .--/ : ;-.()                                            \r\n"
							+ "             :  .' \"-./.'.-'  ;  \"\"    __.._                                     \r\n"
							+ "             './ __..-`.-\"-._/\"\"\"\"\"\"--:._   \"-.                                  \r\n"
							+ "           _.-\"\"\"\"-._                    \"-.   \\                                 \r\n"
							+ "        .-\"  __..----\"\"t\"\"\"----.._          \\   \\             ___...+------.     \r\n"
							+ "      .'__.-\"_..--\"\"-.__jj-. (+)\\  `.         ;   ;         .-\"    .-\"     /;    \r\n"
							+ "      \"\"   \"\"         j /  ;    .^\"       .-\"  .' \"-------\"       \\__..--j._     \r\n"
							+ "                     / i   :_.-\"   _..--\"\"   .'                 .-\" /\\\\\\/  \\;    \r\n"
							+ "                    / /;;  ;(      ___...-+-\"                .-\"   /o.-\" .-t\\    \r\n"
							+ "                   / / :;  '._LL.+\"\\    `.o`..._          .-\"    .'\"\" .-\"   \"    \r\n"
							+ "                 /`-:   ;;   ;   ;  \\    :`. `. \"\"\"\"----\"\"-.___.'\\ .-\"           \r\n"
							+ "        _......_/   /   ::   :`-':   \\    \\ `. `. ====     .-j\\ .+t..._          \r\n"
							+ "     .-\"       /   /     ;    ;  :-.  \\  .'`. `. `.===  .-\".'.-\"       \"-.       \r\n"
							+ "   .'     _.../   /`.    :    :  ;  \\  `:_.._`--`. `---' .'.'   _..._     `..-.  \r\n"
							+ "  /    .-\"   /   /   \\         ; ;   L.+\" .. `,  :     .'.'  .-\"     \"-. .-\"\\  \\ \r\n"
							+ " :    /     /   /\\    ;       ,:_;.-\"  : (  ) ;   )  .'.'-._/         .-t   .--.;\r\n"
							+ " ;   :   .-/   /  ;   :       :  \\`._  '. \"\" .'  : .'.'-._  \"-._.----\"   t-\" :  '\r\n"
							+ ":   :   ; /   i    ;   ;       \\_ `. \"\"\"\"\"\"\"\" `. ;'.;  :  \"+._  \"-:_  .-\" ;   ;  \r\n"
							+ ";   ;   ;/   /:    :   :        `., \"\"\"\"\"\";..__.'.',^--;   ;  \"+._o \"^.   :   :  \r\n"
							+ ":   :   '\\_.'.'    ;   ;          \"-:____/...___\"--^-+-:   :   '. \"-._;   ;   ;  \r\n"
							+ " ;   :    \"\"\"     ;   :                         \"\"\"\"\"'  ;   :    \"\"\"     ;   :   \r\n"
							+ " :    \\          /    ;                             bug :    \\          /    ;   \r\n"
							+ "  \\    \"-.____.-\"    /                                   \\    \"-.____.-\"    /    \r\n"
							+ "   `.              .'                                     `.              .'     \r\n"
							+ "     \"-._      _.-\"                                         \"-._      _.-\"       \r\n"
							+ "         \"\"\"\"\"\"                                                 \"\"\"\"\"\"  ");
					yamaha();
					break;
				case 2:
					tvsapache();
					break;
				case 3:
					bmw();
					break;
				case 4:
					pulsar();
					break;
				case 5:
					suzuki();
			}
			System.out.println("Enter y to continue other key to exit");
			String k = sc.next().toLowerCase();

			key=k.charAt(0);
		} while(key=='y');
	}
	static void yamaha() {
		System.out.println("155 cc performance sportsbike\nEngine: 155 cc liquid-cooled, VVA\nOn-road price (India): approx. ₹1.95 lakh – ₹2.05 lakh (varies by city) \nTax/GST impact: Bikes under 350 cc attract 18 % GST (reduced from earlier higher rate). Two-wheeler GST regime updated September 2025. \nPros: Track-like handling, modern electronics (slipper clutch, quick response)\nCons: Aggressive riding posture may be firm for long commutes");

	}
	static void tvsapache() {
		System.out.println("\r\n"
				+ "Category: Mid-range fully-faired sportsbike\r\n"
				+ "Engine: 312 cc liquid-cooled\r\n"
				+ "On-road price (India): approx. ₹2.90 thousand – ₹3.10 thousand range on-road price \r\n"
				+ "\r\n"
				+ "Tax/GST: Under 350 cc GST @ 18 % after recent reforms; recent price cuts reflect this change. \r\n"
				+ "\r\n"
				+ "Pros: Strong mid-range power, good touring ability\r\n"
				+ "Cons: Premium spares and servicing cost");
	}
	static void bmw() {
		System.out.println("Category: Premium 300 cc sportsbike\r\n"
				+ "Engine: 312 cc, sport-tuned\r\n"
				+ "On-road price (India): approx. ₹3.15 lakh – ₹3.25 lakh \r\n"
				+ "\r\n"
				+ "Tax/GST: Bikes below 350 cc taxed at 18 % GST, making pricing more competitive relative to earlier. \r\n"
				+ "\r\n"
				+ "Pros: European brand cachet, refined components\r\n"
				+ "Cons: Service/ownership cost higher than mainstream brands");
	}
	static void pulsar() {
		System.out.println("Category: 200 cc performance sport-tourer\r\n"
				+ "Engine: ~199.5 cc\r\n"
				+ "On-road price (India): approx. ₹2.00 lakh – ₹2.10 lakh \r\n"
				+ "\r\n"
				+ "Tax/GST: Falls under <350 cc GST slab (18 %). \r\n"
				+ "\r\n"
				+ "Pros: Good balance of performance and comfort\r\n"
				+ "Cons: Ergonomics not as aggressive as pure racers");
	}
	static void suzuki() {
		System.out.println("Category: 250 cc semi-faired sportsbike\r\n"
				+ "Engine: ~249 cc\r\n"
				+ "On-road price (India): approx. ₹2.15 lakh – ₹2.25 lakh \r\n"
				+ "\r\n"
				+ "Tax/GST: <350 cc GST @ 18 %. \r\n"
				+ "\r\n"
				+ "Pros: Comfort, fuel economy and practicality\r\n"
				+ "Cons: Power less than higher cc rivals for spirited riding");
	}


}
