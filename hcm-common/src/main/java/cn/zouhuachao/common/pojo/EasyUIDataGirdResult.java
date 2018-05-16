package cn.zouhuachao.common.pojo;

import java.util.List;

@SuppressWarnings("rawtypes")
public class EasyUIDataGirdResult{

	private long total;
	private List rows;
	
	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "EasyUIDataGirdResult [total=" + total + ", rows=" + rows + "]";
	}
}
