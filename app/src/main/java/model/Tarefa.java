package model;



public class Tarefa {

    private Integer _id;
    private String tarefa;
    private String dt_criacao;
    private String dt_completada;

    public Tarefa(){}

    public Tarefa(Integer id, String tarefa, String dtcriacao, String dtcompletada) {
        this._id = id;
        this.tarefa = tarefa;
        this.dt_criacao = dtcriacao;
        this.dt_completada = dtcompletada;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public String getDt_criacao() {
        return dt_criacao;
    }

    public void setDt_criacao(String dt_criacao) {
        this.dt_criacao = dt_criacao;
    }

    public String getDt_completada() {
        return dt_completada;
    }

    public void setDt_completada(String dt_completada) {
        this.dt_completada = dt_completada;
    }
}
