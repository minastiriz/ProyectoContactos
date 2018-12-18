package viewModel;

import abstractFeatures.IBasicModelView;
import abstractFeatures.IModelFunctionality;
import abstractFeatures.IModelViewFunctionality;
import abstractFeatures.IViewFunctionality;
import messages.IObservers;

/**
 * 
 * Sirve como punto de unión de todas las interfaces que debe implementar el View-Model en
 * nuestro sistema para poder funcionar correctamente.
 * 
 * @author al341918
 * 
 * @version 0.1
 *
 */
public abstract class BasicViewModel implements IBasicModelView, IModelViewFunctionality, IObservers{
	
	protected IModelFunctionality model;
	protected IViewFunctionality view;

	@Override
	public void setModel(IModelFunctionality model) {
		this.model = model;
		
	}

	@Override
	public void setView(IViewFunctionality view) {
		this.view = view;
		
	}

}
