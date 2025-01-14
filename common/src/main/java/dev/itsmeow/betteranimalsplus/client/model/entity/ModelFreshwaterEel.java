package dev.itsmeow.betteranimalsplus.client.model.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;

/**
 * EelFreshWater - Batman Created using Tabula 7.0.1
 */
public class ModelFreshwaterEel<T extends LivingEntity> extends EntityModel<T> {
    public ModelPart body;
    public ModelPart rear;
    public ModelPart neck;
    public ModelPart topFin1;
    public ModelPart lowFin1;
    public ModelPart lFin;
    public ModelPart rFin;
    public ModelPart tail1;
    public ModelPart topFin2;
    public ModelPart lowFin2;
    public ModelPart tail2;
    public ModelPart topFin3;
    public ModelPart lowFin3;
    public ModelPart topFin4;
    public ModelPart lowFin4;
    public ModelPart topJaw;
    public ModelPart lowJaw;
    public ModelPart snout;
    public ModelPart noseNubL;
    public ModelPart noseNubR;
    public ModelPart topTeeth1;
    public ModelPart topTeeth2;
    public ModelPart topTeeth3;
    public ModelPart lowTeeth;

    public ModelFreshwaterEel() {
        this.texWidth = 40;
        this.texHeight = 130;
        this.snout = new ModelPart(this, 0, 70);
        this.snout.setPos(0.0F, 0.0F, -2.8F);
        this.snout.addBox(-1.5F, -0.5F, 0.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(snout, 0.31869712141416456F, 0.0F, 0.0F);
        this.noseNubR = new ModelPart(this, 11, 75);
        this.noseNubR.setPos(-1.0F, 0.0F, -2.8F);
        this.noseNubR.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(noseNubR, 0.091106186954104F, 0.136659280431156F, 0.0F);
        this.topTeeth2 = new ModelPart(this, 0, 0);
        this.topTeeth2.setPos(-1.1F, 0.2F, -2.5F);
        this.topTeeth2.addBox(0.0F, 0.0F, -0.2F, 0, 1, 2, 0.0F);
        this.lowTeeth = new ModelPart(this, 0, 6);
        this.lowTeeth.setPos(0.0F, -1.2F, -2.5F);
        this.lowTeeth.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.body = new ModelPart(this, 0, 0);
        this.body.setPos(0.0F, 19.3F, 0.0F);
        this.body.addBox(-2.0F, -1.5F, -10.0F, 4, 3, 10, 0.0F);
        this.neck = new ModelPart(this, 0, 55);
        this.neck.setPos(0.0F, 0.0F, -9.7F);
        this.neck.addBox(-2.0F, -1.5F, -6.0F, 4, 3, 6, 0.0F);
        this.tail2 = new ModelPart(this, 0, 45);
        this.tail2.setPos(0.0F, 0.0F, 8.0F);
        this.tail2.addBox(-0.5F, -1.0F, 0.0F, 1, 3, 6, 0.0F);
        this.noseNubL = new ModelPart(this, 11, 75);
        this.noseNubL.setPos(1.0F, 0.0F, -2.8F);
        this.noseNubL.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(noseNubL, 0.091106186954104F, -0.136659280431156F, 0.0F);
        this.lFin = new ModelPart(this, 0, 12);
        this.lFin.mirror = true;
        this.lFin.setPos(2.0F, 0.0F, -9.5F);
        this.lFin.addBox(0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F);
        this.setRotateAngle(lFin, 0.0F, 0.36425021489121656F, -0.31869712141416456F);
        this.rFin = new ModelPart(this, 0, 12);
        this.rFin.setPos(-2.0F, 0.0F, -9.5F);
        this.rFin.addBox(0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F);
        this.setRotateAngle(rFin, 0.0F, -0.36425021489121656F, 0.31869712141416456F);
        this.lowFin3 = new ModelPart(this, 0, 100);
        this.lowFin3.setPos(0.0F, 2.0F, 0.0F);
        this.lowFin3.addBox(0.0F, 0.0F, 0.0F, 0, 3, 8, 0.0F);
        this.topFin4 = new ModelPart(this, 0, 84);
        this.topFin4.setPos(0.0F, -1.0F, 0.0F);
        this.topFin4.addBox(0.0F, -3.0F, 0.0F, 0, 6, 9, 0.0F);
        this.topFin3 = new ModelPart(this, 0, 81);
        this.topFin3.setPos(0.0F, -1.0F, 0.0F);
        this.topFin3.addBox(0.0F, -3.0F, 0.0F, 0, 3, 8, 0.0F);
        this.rear = new ModelPart(this, 0, 16);
        this.rear.setPos(0.0F, 0.0F, -0.3F);
        this.rear.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 10, 0.0F);
        this.topTeeth3 = new ModelPart(this, 0, 4);
        this.topTeeth3.setPos(0.0F, 0.0F, -2.6F);
        this.topTeeth3.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F);
        this.topTeeth1 = new ModelPart(this, 0, 0);
        this.topTeeth1.setPos(1.1F, 0.2F, -2.5F);
        this.topTeeth1.addBox(0.0F, 0.0F, -0.2F, 0, 1, 2, 0.0F);
        this.lowFin4 = new ModelPart(this, 0, 103);
        this.lowFin4.setPos(0.0F, 2.0F, 0.0F);
        this.lowFin4.addBox(0.0F, 0.0F, 0.0F, 0, 3, 9, 0.0F);
        this.lowFin2 = new ModelPart(this, 0, 94);
        this.lowFin2.setPos(0.0F, 4.5F, 0.0F);
        this.lowFin2.addBox(0.0F, -3.0F, 0.0F, 0, 3, 10, 0.0F);
        this.topJaw = new ModelPart(this, 0, 65);
        this.topJaw.setPos(0.0F, 0.1F, -6.0F);
        this.topJaw.addBox(-2.0F, -0.5F, -3.0F, 4, 1, 3, 0.0F);
        this.setRotateAngle(topJaw, -0.045553093477052F, 0.0F, 0.0F);
        this.tail1 = new ModelPart(this, 0, 32);
        this.tail1.setPos(0.0F, -0.5F, 9.6F);
        this.tail1.addBox(-1.0F, -1.0F, 0.0F, 2, 3, 8, 0.0F);
        this.lowJaw = new ModelPart(this, 0, 75);
        this.lowJaw.setPos(0.0F, 1.0F, -5.8F);
        this.lowJaw.addBox(-1.5F, -0.5F, -3.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(lowJaw, 0.7740535232594852F, 0.0F, 0.0F);
        this.topFin2 = new ModelPart(this, 0, 75);
        this.topFin2.setPos(0.0F, -1.5F, 0.0F);
        this.topFin2.addBox(0.0F, -3.0F, 0.0F, 0, 3, 10, 0.0F);
        this.topFin1 = new ModelPart(this, 0, 76);
        this.topFin1.setPos(0.0F, -1.5F, -5.0F);
        this.topFin1.addBox(0.0F, -3.0F, 0.0F, 0, 3, 5, 0.0F);
        this.lowFin1 = new ModelPart(this, 0, 97);
        this.lowFin1.setPos(0.0F, 1.5F, -3.0F);
        this.lowFin1.addBox(0.0F, 0.0F, 0.0F, 0, 3, 3, 0.0F);
        this.topJaw.addChild(this.snout);
        this.topJaw.addChild(this.noseNubR);
        this.topJaw.addChild(this.topTeeth2);
        this.lowJaw.addChild(this.lowTeeth);
        this.body.addChild(this.neck);
        this.tail1.addChild(this.tail2);
        this.topJaw.addChild(this.noseNubL);
        this.body.addChild(this.lFin);
        this.body.addChild(this.rFin);
        this.tail1.addChild(this.lowFin3);
        this.tail2.addChild(this.topFin4);
        this.tail1.addChild(this.topFin3);
        this.body.addChild(this.rear);
        this.topJaw.addChild(this.topTeeth3);
        this.topJaw.addChild(this.topTeeth1);
        this.tail2.addChild(this.lowFin4);
        this.rear.addChild(this.lowFin2);
        this.neck.addChild(this.topJaw);
        this.rear.addChild(this.tail1);
        this.neck.addChild(this.lowJaw);
        this.rear.addChild(this.topFin2);
        this.body.addChild(this.topFin1);
        this.body.addChild(this.lowFin1);
    }

    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float factor = (float) entity.getDeltaMovement().length() * 10;
        this.body.yRot = Mth.cos(ageInTicks * 0.3F) * (float) Math.PI * 0.05F * factor;
        this.neck.yRot = -this.body.yRot * 1.5F;
        this.rear.yRot = this.body.yRot * 1.5F;
        this.tail1.yRot = this.rear.yRot * 1.5F;
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelPart ModelRenderer, float x, float y, float z) {
        ModelRenderer.xRot = x;
        ModelRenderer.yRot = y;
        ModelRenderer.zRot = z;
    }
}
