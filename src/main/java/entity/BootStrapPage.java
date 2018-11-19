package entity;

import java.util.List;

public class BootStrapPage<T> {
	//总记录数
	private long total;
	//总记录行
	private List<T> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public BootStrapPage() {
		super();
	}
	public BootStrapPage(long total, List<T> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	
}
