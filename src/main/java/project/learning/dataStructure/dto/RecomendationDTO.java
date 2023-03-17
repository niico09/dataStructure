package project.learning.dataStructure.dto;

public class RecomendationDTO {

	private ItemDTO itemDTO;

	private float predictedRating;

	public ItemDTO getItemDTO() {
		return itemDTO;
	}

	public void setItemDTO(ItemDTO itemDTO) {
		this.itemDTO = itemDTO;
	}

	public float getPredictedRating() {
		return predictedRating;
	}

	public void setPredictedRating(float predictedRating) {
		this.predictedRating = predictedRating;
	}

}
