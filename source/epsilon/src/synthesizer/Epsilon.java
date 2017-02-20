package synthesizer;


public class Epsilon {
	public static void main(String[] args) {
		if (args.length == 1) {
			double size = Double.parseDouble(args[0]);
			EpsilonSynthesizer epsilonFac = new EpsilonSynthesizer(size);
			epsilonFac.synthesize();
		}
		else {
			System.err.println("Epsilon Synthesizer-1.0");
			System.err.println("Usage: java Epsilon <SizeFactor>");
			System.err.println("SizeFactor = (double, 1.0 = 100kb)");
			System.exit(1);
		}

	}
}
