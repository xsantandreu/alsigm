package es.ieci.tecdoc.isicres.api.intercambioregistral.business.manager;

import es.ieci.tecdoc.isicres.api.intercambioregistral.business.vo.TipoTransporteIntercambioRegistralVO;

public interface TipoTransporteIntercambioRegistralManager {

	/**
	 * Devuelve un tipo de transporte a partir de la descripcion.
	 *
	 * Primero busca en la descripci�n por defecto y si no lo encuentra busca en
	 * las tablas de internacionalizaci�n.
	 *
	 * @param descripcion
	 *            Descripci�n del tipo de transporte
	 *
	 * @return Tipo de Transporte
	 */
	public TipoTransporteIntercambioRegistralVO getTipoTransporteByDesc(
			String descripcion);

	/**
	 * Devuelve un tipo de transporte a partir del codigo SIR
	 *
	 * @param codigo
	 *            C�digo SIR
	 *
	 * @return
	 */
	public TipoTransporteIntercambioRegistralVO getTipoTransporteByCodigo(
			String codigo);

	/**
	 * Devuelve el n�mero total de tipos de transporte a partir del codigo SIR
	 *
	 * @param codigo
	 *            C�digo SIR
	 *
	 * @return int
	 */
	public int getCountTipoTransporteByCodigo(
			String codigo);

	/**
	 * Devuelve un tipo de transporte a partir del codigo SIR
	 *
	 * @param codigo
	 *            C�digo SIR
	 * @param idScrTT
	 *            id del tipo de transporte de ISicres (SCR_TT)
	 *
	 * @return TipoTransporteIntercambioRegistralVO
	 */
	public TipoTransporteIntercambioRegistralVO getTipoTransporteByCodigoAndIDScrTT(
			String codigo, Integer idScrTT);

	/**
	 * Devuelve un tipo de transporte a partir del identificador de SICRES
	 *
	 * @param codigo
	 *            Identificador del tipo de transporte en Sicres
	 *
	 * @return
	 */
	public TipoTransporteIntercambioRegistralVO getTipoTransporteByIdSicres(
			Integer idTipoTransporte);

	/**
	 * Actualiza el c�digo SIR del tipo de transporte a partir de la
	 * descripci�n.
	 *
	 * @param tipoTransporteIntercambioRegistralVO
	 */
	public void updateByIdTipoTransporte(
			TipoTransporteIntercambioRegistralVO tipoTransporteIntercambioRegistralVO);

	/**
	 * Crea un nuevo mapeo de tipo de transporte para intercambio registral.
	 *
	 * Mapea la descripci�n del tipo de tranporte en sicres con el c�digo del
	 * tipo de transporte en SIR.
	 *
	 * @param tipoTransporteIntercambioRegistralVO
	 * @return
	 */
	public TipoTransporteIntercambioRegistralVO save(
			TipoTransporteIntercambioRegistralVO tipoTransporteIntercambioRegistralVO);

	/**
	 * Elimina el mapeo de tipo de transporte para intercambio registral.
	 *
	 *
	 * @param id Identificador del tipo de transporte
	 */
	public void delete(Long id);

}
