package dev.itsmeow.betteranimalsplus.client.model.shark;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import dev.itsmeow.betteranimalsplus.common.entity.EntityShark;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

/**
 * Great White Shark - Batman
 * Created using Tabula 7.0.1
 */
public class ModelGreatWhiteShark extends EntityModel<EntityShark> {
    public ModelRenderer body;
    public ModelRenderer tail00;
    public ModelRenderer neck;
    public ModelRenderer lFin00;
    public ModelRenderer rFin00;
    public ModelRenderer dorsalFin00;
    public ModelRenderer tail01;
    public ModelRenderer tail02;
    public ModelRenderer lLowerTailFin;
    public ModelRenderer rLowerTailFin;
    public ModelRenderer tail03;
    public ModelRenderer tail04;
    public ModelRenderer upperTailFin;
    public ModelRenderer mLowerTailFin;
    public ModelRenderer tail05;
    public ModelRenderer tailFinUpper00;
    public ModelRenderer tailFinLower00;
    public ModelRenderer tailFinUpper01;
    public ModelRenderer tailFinUpper02;
    public ModelRenderer tailFinLower01;
    public ModelRenderer tailFinLower02;
    public ModelRenderer head;
    public ModelRenderer lowJaw;
    public ModelRenderer snout;
    public ModelRenderer cranium;
    public ModelRenderer topTeethL;
    public ModelRenderer topTeethR;
    public ModelRenderer cranium2;
    public ModelRenderer lowTeeth;
    public ModelRenderer lFin01;
    public ModelRenderer lFin02;
    public ModelRenderer rFin01;
    public ModelRenderer rFin02;
    public ModelRenderer dorsalFin01;
    public ModelRenderer dorsalFin03;
    public ModelRenderer dorsalFin02;
    public ModelRenderer dorsalFin04;

    public ModelGreatWhiteShark() {
        this.texWidth = 80;
        this.texHeight = 200;
        this.topTeethR = new ModelRenderer(this, 48, 136);
        this.topTeethR.setPos(0.1F, 1.9F, -4.7F);
        this.topTeethR.addBox(-5.0F, 0.0F, 0.0F, 5, 1, 3, 0.0F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setPos(0.0F, 13.0F, 3.0F);
        this.body.addBox(-6.5F, -5.5F, -14.0F, 13, 13, 17, 0.0F);
        this.setRotateAngle(body, 0.022863813201125717F, 0.0F, 0.0F);
        this.tail01 = new ModelRenderer(this, 0, 56);
        this.tail01.setPos(0.0F, -1.4F, 13.4F);
        this.tail01.addBox(-4.0F, -3.0F, 0.0F, 8, 10, 9, 0.0F);
        this.setRotateAngle(tail01, -0.04363323129985824F, 0.0F, 0.0F);
        this.rFin00 = new ModelRenderer(this, 0, 160);
        this.rFin00.setPos(-5.6F, 5.0F, -13.9F);
        this.rFin00.addBox(-0.5F, 0.0F, 0.0F, 1, 7, 7, 0.0F);
        this.setRotateAngle(rFin00, 0.18203784098300857F, 0.0F, 0.7740535232594852F);
        this.rLowerTailFin = new ModelRenderer(this, 42, 156);
        this.rLowerTailFin.setPos(-3.2F, 6.0F, 1.5F);
        this.rLowerTailFin.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 3, 0.0F);
        this.setRotateAngle(rLowerTailFin, 0.36425021489121656F, 0.0F, 0.5462880558742251F);
        this.tail02 = new ModelRenderer(this, 34, 56);
        this.tail02.setPos(0.0F, 0.5F, 8.3F);
        this.tail02.addBox(-3.0F, -3.0F, 0.0F, 6, 8, 7, 0.0F);
        this.setRotateAngle(tail02, -1.7453292519943296E-4F, 0.0F, 0.0F);
        this.dorsalFin01 = new ModelRenderer(this, 24, 144);
        this.dorsalFin01.setPos(0.0F, -4.1F, 0.4F);
        this.dorsalFin01.addBox(-1.5F, 0.0F, 0.0F, 2, 3, 6, 0.0F);
        this.setRotateAngle(dorsalFin01, -0.136659280431156F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 0, 112);
        this.head.setPos(0.0F, 0.8F, -11.0F);
        this.head.addBox(-5.5F, -3.0F, -5.0F, 11, 5, 5, 0.0F);
        this.setRotateAngle(head, 0.045553093477052F, 0.0F, 0.0F);
        this.tailFinLower00 = new ModelRenderer(this, 40, 71);
        this.tailFinLower00.setPos(0.0F, 1.9F, 1.5F);
        this.tailFinLower00.addBox(-0.49F, 0.0F, -1.5F, 1, 3, 5, 0.0F);
        this.setRotateAngle(tailFinLower00, 0.22759093446006054F, 0.0F, 0.0F);
        this.tail04 = new ModelRenderer(this, 22, 75);
        this.tail04.setPos(0.0F, -0.1F, 5.9F);
        this.tail04.addBox(-2.0F, -1.5F, 0.0F, 4, 5, 4, 0.0F);
        this.snout = new ModelRenderer(this, 32, 112);
        this.snout.setPos(0.0F, 2.0F, -4.0F);
        this.snout.addBox(-5.0F, -3.0F, -7.0F, 10, 3, 6, 0.0F);
        this.setRotateAngle(snout, -0.4553564018453205F, 0.0F, 0.0F);
        this.upperTailFin = new ModelRenderer(this, 32, 165);
        this.upperTailFin.setPos(-0.5F, -1.4F, 1.8F);
        this.upperTailFin.addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(upperTailFin, 1.2292353921796064F, 0.0F, 0.0F);
        this.tail03 = new ModelRenderer(this, 0, 75);
        this.tail03.setPos(0.0F, -0.6F, 6.7F);
        this.tail03.addBox(-2.5F, -2.0F, 0.0F, 5, 6, 6, 0.0F);
        this.topTeethL = new ModelRenderer(this, 28, 136);
        this.topTeethL.setPos(-0.1F, 1.9F, -4.7F);
        this.topTeethL.addBox(0.0F, 0.0F, 0.0F, 5, 1, 4, 0.0F);
        this.tailFinUpper00 = new ModelRenderer(this, 38, 89);
        this.tailFinUpper00.setPos(0.0F, -0.5F, 1.5F);
        this.tailFinUpper00.addBox(-0.51F, -6.0F, -1.5F, 1, 6, 5, 0.0F);
        this.setRotateAngle(tailFinUpper00, -0.6373942428283291F, 0.0F, 0.0F);
        this.lFin02 = new ModelRenderer(this, 28, 155);
        this.lFin02.mirror = true;
        this.lFin02.setPos(0.0F, 3.7F, 1.0F);
        this.lFin02.addBox(0.0F, 0.0F, -1.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(lFin02, 0.136659280431156F, 0.0F, 0.0F);
        this.lFin01 = new ModelRenderer(this, 18, 160);
        this.lFin01.mirror = true;
        this.lFin01.setPos(-0.5F, 6.9F, 0.0F);
        this.lFin01.addBox(0.0F, 0.0F, 0.0F, 1, 4, 5, 0.0F);
        this.setRotateAngle(lFin01, 0.22759093446006054F, 0.0F, 0.0F);
        this.dorsalFin00 = new ModelRenderer(this, 0, 148);
        this.dorsalFin00.setPos(0.5F, -7.6F, -7.7F);
        this.dorsalFin00.addBox(-2.0F, -1.4F, 0.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(dorsalFin00, -0.40980330836826856F, 0.0F, 0.0F);
        this.mLowerTailFin = new ModelRenderer(this, 42, 165);
        this.mLowerTailFin.setPos(-0.5F, 3.6F, 1.9F);
        this.mLowerTailFin.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(mLowerTailFin, 0.40980330836826856F, 0.0F, 0.0F);
        this.tail05 = new ModelRenderer(this, 53, 81);
        this.tail05.setPos(0.0F, 0.0F, 3.4F);
        this.tail05.addBox(-1.0F, -1.5F, 0.0F, 2, 4, 5, 0.0F);
        this.cranium = new ModelRenderer(this, 0, 122);
        this.cranium.setPos(0.0F, -2.8F, -9.4F);
        this.cranium.addBox(-3.5F, 0.0F, 0.0F, 7, 2, 5, 0.0F);
        this.lLowerTailFin = new ModelRenderer(this, 42, 156);
        this.lLowerTailFin.mirror = true;
        this.lLowerTailFin.setPos(3.2F, 6.0F, 1.5F);
        this.lLowerTailFin.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 3, 0.0F);
        this.setRotateAngle(lLowerTailFin, 0.36425021489121656F, 0.0F, -0.5462880558742251F);
        this.lowJaw = new ModelRenderer(this, 0, 131);
        this.lowJaw.setPos(0.0F, 3.5F, -10.6F);
        this.lowJaw.addBox(-5.0F, -0.5F, -5.0F, 10, 3, 5, 0.0F);
        this.setRotateAngle(lowJaw, -0.091106186954104F, 0.0F, 0.0F);
        this.dorsalFin02 = new ModelRenderer(this, 41, 144);
        this.dorsalFin02.setPos(-1.0F, -1.8F, 0.2F);
        this.dorsalFin02.addBox(0.0F, -2.2F, 0.1F, 1, 4, 4, 0.0F);
        this.setRotateAngle(dorsalFin02, -0.08726646259971647F, 0.0F, 0.0F);
        this.dorsalFin03 = new ModelRenderer(this, 51, 142);
        this.dorsalFin03.setPos(-1.0F, -7.2F, 2.3F);
        this.dorsalFin03.addBox(0.0F, -3.1F, -1.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(dorsalFin03, -0.5235987755982988F, 0.0F, 0.0F);
        this.tail00 = new ModelRenderer(this, 0, 30);
        this.tail00.setPos(0.0F, -1.0F, 1.3F);
        this.tail00.addBox(-5.5F, -4.5F, 0.0F, 11, 12, 14, 0.0F);
        this.setRotateAngle(tail00, -0.05969026041820607F, 0.0F, 0.0F);
        this.tailFinLower02 = new ModelRenderer(this, 53, 71);
        this.tailFinLower02.setPos(0.0F, 4.0F, -1.0F);
        this.tailFinLower02.addBox(-0.5F, 0.0F, 0.0F, 1, 5, 3, 0.0F);
        this.setRotateAngle(tailFinLower02, 0.18203784098300857F, 0.0F, 0.0F);
        this.rFin02 = new ModelRenderer(this, 28, 155);
        this.rFin02.setPos(0.0F, 3.7F, 1.0F);
        this.rFin02.addBox(0.0F, 0.0F, -1.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(rFin02, 0.136659280431156F, 0.0F, 0.0F);
        this.cranium2 = new ModelRenderer(this, 26, 123);
        this.cranium2.setPos(0.0F, -0.9F, 0.4F);
        this.cranium2.addBox(-4.5F, 0.0F, 0.0F, 9, 3, 9, 0.0F);
        this.setRotateAngle(cranium2, 0.27314402793711257F, 0.0F, 0.0F);
        this.lFin00 = new ModelRenderer(this, 0, 160);
        this.lFin00.mirror = true;
        this.lFin00.setPos(5.6F, 5.0F, -13.9F);
        this.lFin00.addBox(-0.5F, 0.0F, 0.0F, 1, 7, 7, 0.0F);
        this.setRotateAngle(lFin00, 0.18203784098300857F, 0.0F, -0.7740535232594852F);
        this.tailFinLower01 = new ModelRenderer(this, 40, 79);
        this.tailFinLower01.setPos(0.0F, 2.6F, -0.5F);
        this.tailFinLower01.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 4, 0.0F);
        this.setRotateAngle(tailFinLower01, 0.36425021489121656F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 0, 88);
        this.neck.setPos(0.0F, 0.0F, -13.6F);
        this.neck.addBox(-6.0F, -5.5F, -12.0F, 12, 12, 12, 0.0F);
        this.setRotateAngle(neck, 0.045553093477052F, 0.0F, 0.0F);
        this.tailFinUpper01 = new ModelRenderer(this, 51, 92);
        this.tailFinUpper01.setPos(0.0F, -5.8F, -0.5F);
        this.tailFinUpper01.addBox(-0.5F, -5.0F, -1.0F, 1, 5, 4, 0.0F);
        this.setRotateAngle(tailFinUpper01, -0.22759093446006054F, 0.0F, 0.0F);
        this.tailFinUpper02 = new ModelRenderer(this, 63, 92);
        this.tailFinUpper02.setPos(0.0F, -4.8F, -0.5F);
        this.tailFinUpper02.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 3, 0.0F);
        this.setRotateAngle(tailFinUpper02, -0.136659280431156F, 0.0F, 0.0F);
        this.lowTeeth = new ModelRenderer(this, 0, 140);
        this.lowTeeth.setPos(0.0F, -1.5F, -3.8F);
        this.lowTeeth.addBox(-4.5F, 0.0F, -1.0F, 9, 1, 5, 0.0F);
        this.rFin01 = new ModelRenderer(this, 18, 160);
        this.rFin01.setPos(-0.5F, 6.9F, 0.0F);
        this.rFin01.addBox(0.0F, 0.0F, 0.0F, 1, 4, 5, 0.0F);
        this.setRotateAngle(rFin01, 0.22759093446006054F, 0.0F, 0.0F);
        this.dorsalFin04 = new ModelRenderer(this, 59, 142);
        this.dorsalFin04.setPos(0.0F, -2.6F, 1.0F);
        this.dorsalFin04.addBox(0.0F, 0.0F, -0.6F, 1, 9, 3, 0.0F);
        this.setRotateAngle(dorsalFin04, 0.7285004297824331F, 0.0F, 0.0F);
        this.head.addChild(this.topTeethR);
        this.tail00.addChild(this.tail01);
        this.body.addChild(this.rFin00);
        this.tail01.addChild(this.rLowerTailFin);
        this.tail01.addChild(this.tail02);
        this.dorsalFin00.addChild(this.dorsalFin01);
        this.neck.addChild(this.head);
        this.tail05.addChild(this.tailFinLower00);
        this.tail03.addChild(this.tail04);
        this.head.addChild(this.snout);
        this.tail03.addChild(this.upperTailFin);
        this.tail02.addChild(this.tail03);
        this.head.addChild(this.topTeethL);
        this.tail05.addChild(this.tailFinUpper00);
        this.lFin01.addChild(this.lFin02);
        this.lFin00.addChild(this.lFin01);
        this.body.addChild(this.dorsalFin00);
        this.tail03.addChild(this.mLowerTailFin);
        this.tail04.addChild(this.tail05);
        this.head.addChild(this.cranium);
        this.tail01.addChild(this.lLowerTailFin);
        this.neck.addChild(this.lowJaw);
        this.dorsalFin01.addChild(this.dorsalFin02);
        this.dorsalFin00.addChild(this.dorsalFin03);
        this.body.addChild(this.tail00);
        this.tailFinLower01.addChild(this.tailFinLower02);
        this.rFin01.addChild(this.rFin02);
        this.cranium.addChild(this.cranium2);
        this.body.addChild(this.lFin00);
        this.tailFinLower00.addChild(this.tailFinLower01);
        this.body.addChild(this.neck);
        this.tailFinUpper00.addChild(this.tailFinUpper01);
        this.tailFinUpper01.addChild(this.tailFinUpper02);
        this.lowJaw.addChild(this.lowTeeth);
        this.rFin00.addChild(this.rFin01);
        this.dorsalFin02.addChild(this.dorsalFin04);
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
    }

    @Override
    public void setupAnim(EntityShark entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        ModelBullShark.animate(entity, ageInTicks, body, tail00, tail01, tail02, lowJaw);
    }

    public void setRotateAngle(ModelRenderer ModelRenderer, float x, float y, float z) {
        ModelRenderer.xRot = x;
        ModelRenderer.yRot = y;
        ModelRenderer.zRot = z;
    }
}
