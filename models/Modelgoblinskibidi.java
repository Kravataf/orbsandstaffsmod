public static class Modelgoblinskibidi extends ModelBase {
	private final ModelRenderer goblin;
	private final ModelRenderer body;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer head;

	public Modelgoblinskibidi() {
		textureWidth = 64;
		textureHeight = 64;

		goblin = new ModelRenderer(this);
		goblin.setRotationPoint(0.0F, 24.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(4.0F, -2.0F, -2.0F);
		goblin.addChild(body);
		body.cubeList.add(new ModelBox(body, 0, 11, -8.0F, -7.0F, 0.0F, 8, 7, 4, 0.0F, false));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(-3.0F, -2.0F, 0.0F);
		goblin.addChild(leftleg);
		leftleg.cubeList.add(new ModelBox(leftleg, 12, 22, -1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F, false));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(3.0F, -2.0F, 0.0F);
		goblin.addChild(rightleg);
		rightleg.cubeList.add(new ModelBox(rightleg, 20, 11, -1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F, false));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(5.0F, -9.0F, 0.0F);
		goblin.addChild(rightarm);
		rightarm.cubeList.add(new ModelBox(rightarm, 6, 22, -1.0F, 0.0F, -1.0F, 1, 5, 2, 0.0F, false));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(-4.5F, -9.0F, 0.0F);
		goblin.addChild(leftarm);
		leftarm.cubeList.add(new ModelBox(leftarm, 0, 22, -0.5F, 0.0F, -1.0F, 1, 5, 2, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -8.125F, 0.0F);
		goblin.addChild(head);
		head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -5.875F, -3.0F, 6, 5, 6, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 18, 0, -5.0F, -4.875F, -0.5F, 10, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 2, -6.0F, -4.875F, -0.5F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 5.0F, -4.875F, -0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		goblin.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}