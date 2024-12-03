package miPrincipal;
public class Performance{
    private long ti;//tiempo inicial
	public long getTi() {
		return ti;
	}
	public void setTi(long ti) {
		this.ti = ti;
	}
	public long getTf() {
		return tf;
	}
	public void setTf(long tf) {
		this.tf = tf;
	}
	public boolean isStoped() {
		return stoped;
	}
	public void setStoped(boolean stoped) {
		this.stoped = stoped;
	}
	private long tf;//tiempo final
	private boolean stoped = false;
	public Performance()
	{
		start();
	}
	public void start()
	{
		//tomamos la fecha/hora actual, expresada en milisegundos
		ti = System.currentTimeMillis();
		stoped = false;
	}
	public void stop() {
		//tomamos la fecha/hora actual, expresada en milisegundos
		tf = System.currentTimeMillis();
		stoped = true;
	}
	public long getMillis()
	{
		return tf-ti;
	}
	public String toString() {
		if (!stoped)
		{
			stop();
		}
		long diff = tf-ti;
		long min = diff/1000/60;
		long sec = (diff/1000) % 60;
		return diff + " milisegundos ("+
				min+" minutos, "+sec+ " segundos)";
	}
}