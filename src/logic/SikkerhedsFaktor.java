package logic;

import exceptions.ArealEjDefineretException;
import exceptions.BoejningsspaendingEjDefineretException;
import exceptions.DimensionerendeKraftEjDefineretException;
import exceptions.FlydeSpaendingEjDefineretException;
import exceptions.ForskydningsspaendingEjDefineretException;
import exceptions.HalvProfilhoejdeEjDefineretException;
import exceptions.InertimomentEjDefineretException;
import exceptions.LaengdeEjDefineretException;
import exceptions.NormalspaendingEjDefineretException;
import exceptions.ReferenceSpaendingEjDefineretException;
import exceptions.SikkerhedsFaktorEjDefineretException;
import exceptions.TvaerkraftEjDefineretException;
import exceptions.VinkelEjDefineretException;

public interface SikkerhedsFaktor {
	public void angivReferencespaending(Referencespaending sigmaRef) throws ReferenceSpaendingEjDefineretException;
	public void angivFlydeSpaending(FlydeSpaending sigmaTill) throws FlydeSpaendingEjDefineretException;
	public void beregnSikkerhedsFaktor() throws FlydeSpaendingEjDefineretException, ReferenceSpaendingEjDefineretException, InertimomentEjDefineretException, HalvProfilhoejdeEjDefineretException, LaengdeEjDefineretException, DimensionerendeKraftEjDefineretException, VinkelEjDefineretException, NormalspaendingEjDefineretException, ArealEjDefineretException, BoejningsspaendingEjDefineretException, ForskydningsspaendingEjDefineretException, TvaerkraftEjDefineretException;
	public String getSikkerhedsFaktorMellemRegning() throws ReferenceSpaendingEjDefineretException, FlydeSpaendingEjDefineretException;
	public double getSikkerhedsFaktor() throws SikkerhedsFaktorEjDefineretException, FlydeSpaendingEjDefineretException, ReferenceSpaendingEjDefineretException, InertimomentEjDefineretException, HalvProfilhoejdeEjDefineretException, LaengdeEjDefineretException, DimensionerendeKraftEjDefineretException, VinkelEjDefineretException, NormalspaendingEjDefineretException, ArealEjDefineretException, BoejningsspaendingEjDefineretException, ForskydningsspaendingEjDefineretException, TvaerkraftEjDefineretException;
}
