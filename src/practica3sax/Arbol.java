
package practica3sax;

public class Arbol {
    
    private String nodos;
   //Creamos todos los atributos del Árbol
     private String codi;
    private String posicioX_ETRS89;
    private String posicioY_ETRS89;
    private String latitud_WGS84;
    private String longitud_WGS84;
    private String  tipusElement;
    private String espaiVerd;
    private String adreca;
    private String alcada;
    private String catEspecieId;
    private String nomCientific;
    private String nomEsp;
    private String nomCat;
    private String categoriaArbrat;
    private String ampladaVorera;
    private String plantacioDT;
    private String tipAigua;
    private String tipReg;
    private String tipSuperf;
    private String tipSuport;
    private String cobertaEscocell;
    private String midaEscocell;
    private String voraEscocell;
    
    public Arbol(){
        
    }

    public Arbol(String nodos, String codi, String posicioX_ETRS89, String posicioY_ETRS89, String latitud_WGS84, String longitud_WGS84, String tipusElement, String espaiVerd, String adreca, String alcada, String catEspecieId, String nomCientific, String nomEsp, String nomCat, String categoriaArbrat, String ampladaVorera, String plantacioDT, String tipAigua, String tipReg, String tipSuperf, String tipSuport, String cobertaEscocell, String midaEscocell, String voraEscocell) {
        this.nodos = nodos;
        this.codi = codi;
        this.posicioX_ETRS89 = posicioX_ETRS89;
        this.posicioY_ETRS89 = posicioY_ETRS89;
        this.latitud_WGS84 = latitud_WGS84;
        this.longitud_WGS84 = longitud_WGS84;
        this.tipusElement = tipusElement;
        this.espaiVerd = espaiVerd;
        this.adreca = adreca;
        this.alcada = alcada;
        this.catEspecieId = catEspecieId;
        this.nomCientific = nomCientific;
        this.nomEsp = nomEsp;
        this.nomCat = nomCat;
        this.categoriaArbrat = categoriaArbrat;
        this.ampladaVorera = ampladaVorera;
        this.plantacioDT = plantacioDT;
        this.tipAigua = tipAigua;
        this.tipReg = tipReg;
        this.tipSuperf = tipSuperf;
        this.tipSuport = tipSuport;
        this.cobertaEscocell = cobertaEscocell;
        this.midaEscocell = midaEscocell;
        this.voraEscocell = voraEscocell;
    }
    //Este metodo nos devuelve un True cuando un árbol tiene todos los nodos.
    public boolean  arbolEntero(){
        if(codi != null && posicioX_ETRS89 != null && posicioY_ETRS89 != null && latitud_WGS84 != null && longitud_WGS84 != null && tipusElement != null && espaiVerd != null && adreca != null && alcada != null && catEspecieId != null && nomCientific != null && nomEsp != null && nomCat != null && categoriaArbrat != null && ampladaVorera != null && plantacioDT != null && tipAigua != null && tipReg != null && tipSuperf != null && tipSuport != null && cobertaEscocell != null && midaEscocell != null){
            return true;
        }else{
        // De lo contrario devuelve false
       return false;
        }
    }
   
    public String getNodos() {
        return nodos;
    }

    public void setNodos(String nodos) {
        this.nodos = nodos;
    }

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public String getPosicioX_ETRS89() {
        return posicioX_ETRS89;
    }

    public void setPosicioX_ETRS89(String posicioX_ETRS89) {
        this.posicioX_ETRS89 = posicioX_ETRS89;
    }

    public String getPosicioY_ETRS89() {
        return posicioY_ETRS89;
    }

    public void setPosicioY_ETRS89(String posicioY_ETRS89) {
        this.posicioY_ETRS89 = posicioY_ETRS89;
    }

    public String getLatitud_WGS84() {
        return latitud_WGS84;
    }

    public void setLatitud_WGS84(String latitud_WGS84) {
        this.latitud_WGS84 = latitud_WGS84;
    }

    public String getLongitud_WGS84() {
        return longitud_WGS84;
    }

    public void setLongitud_WGS84(String longitud_WGS84) {
        this.longitud_WGS84 = longitud_WGS84;
    }

    public String getTipusElement() {
        return tipusElement;
    }

    public void setTipusElement(String tipusElement) {
        this.tipusElement = tipusElement;
    }

    public String getEspaiVerd() {
        return espaiVerd;
    }

    public void setEspaiVerd(String espaiVerd) {
        this.espaiVerd = espaiVerd;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public String getAlcada() {
        return alcada;
    }

    public void setAlcada(String alcada) {
        this.alcada = alcada;
    }

    public String getCatEspecieId() {
        return catEspecieId;
    }

    public void setCatEspecieId(String catEspecieId) {
        this.catEspecieId = catEspecieId;
    }

    public String getNomCientific() {
        return nomCientific;
    }

    public void setNomCientific(String nomCientific) {
        this.nomCientific = nomCientific;
    }

    public String getNomEsp() {
        return nomEsp;
    }

    public void setNomEsp(String nomEsp) {
        this.nomEsp = nomEsp;
    }

    public String getNomCat() {
        return nomCat;
    }

    public void setNomCat(String nomCat) {
        this.nomCat = nomCat;
    }

    public String getCategoriaArbrat() {
        return categoriaArbrat;
    }

    public void setCategoriaArbrat(String categoriaArbrat) {
        this.categoriaArbrat = categoriaArbrat;
    }

    public String getAmpladaVorera() {
        return ampladaVorera;
    }

    public void setAmpladaVorera(String ampladaVorera) {
        this.ampladaVorera = ampladaVorera;
    }

    public String getPlantacioDT() {
        return plantacioDT;
    }

    public void setPlantacioDT(String plantacioDT) {
        this.plantacioDT = plantacioDT;
    }

    public String getTipAigua() {
        return tipAigua;
    }

    public void setTipAigua(String tipAigua) {
        this.tipAigua = tipAigua;
    }

    public String getTipReg() {
        return tipReg;
    }

    public void setTipReg(String tipReg) {
        this.tipReg = tipReg;
    }

    public String getTipSuperf() {
        return tipSuperf;
    }

    public void setTipSuperf(String tipSuperf) {
        this.tipSuperf = tipSuperf;
    }

    public String getTipSuport() {
        return tipSuport;
    }

    public void setTipSuport(String tipSuport) {
        this.tipSuport = tipSuport;
    }

    public String getCobertaEscocell() {
        return cobertaEscocell;
    }

    public void setCobertaEscocell(String cobertaEscocell) {
        this.cobertaEscocell = cobertaEscocell;
    }

    public String getMidaEscocell() {
        return midaEscocell;
    }

    public void setMidaEscocell(String midaEscocell) {
        this.midaEscocell = midaEscocell;
    }

    public String getVoraEscocell() {
        return voraEscocell;
    }

    public void setVoraEscocell(String voraEscocell) {
        this.voraEscocell = voraEscocell;
    }

    @Override
    public String toString() {
        return "Arbol{" + "codi=" + codi + ", posicioX_ETRS89=" + posicioX_ETRS89 + ", posicioY_ETRS89=" + posicioY_ETRS89 + ", latitud_WGS84=" + latitud_WGS84 + ", longitud_WGS84=" + longitud_WGS84 + ", tipusElement=" + tipusElement + ", espaiVerd=" + espaiVerd + ", adreca=" + adreca + ", alcada=" + alcada + ", catEspecieId=" + catEspecieId + ", nomCientific=" + nomCientific + ", nomEsp=" + nomEsp + ", nomCat=" + nomCat + ", categoriaArbrat=" + categoriaArbrat + ", ampladaVorera=" + ampladaVorera + ", plantacioDT=" + plantacioDT + ", tipAigua=" + tipAigua + ", tipReg=" + tipReg + ", tipSuperf=" + tipSuperf + ", tipSuport=" + tipSuport + ", cobertaEscocell=" + cobertaEscocell + ", midaEscocell=" + midaEscocell + ", voraEscocell=" + voraEscocell + '}';
    }

    
    
}
