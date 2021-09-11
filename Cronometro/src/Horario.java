
public class Horario extends Minutero {

	protected int hora;

	public Horario(int segundo, int minuto, int hora) {
		super(segundo, minuto);
		this.hora = hora;
	}

	public void imprimir() {
		for (hora = 0; hora < 23; hora++) {
			for (minuto = 0; minuto < 60; minuto++) {
				for (segundo = 0; segundo < 60; segundo++) {
					System.out.println(hora + ":" + minuto + ":" + segundo);
					delaySegundo();
				}
			}
		}
	}

	private static void delaySegundo() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
	}
}