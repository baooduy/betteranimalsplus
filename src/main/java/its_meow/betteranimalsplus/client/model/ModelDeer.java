package its_meow.betteranimalsplus.client.model;

import its_meow.betteranimalsplus.common.entity.EntityDeer;
import net.minecraft.client.renderer.entity.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

/**
 * deer2 - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelDeer<T extends LivingEntity> extends ModelBetterAnimals<T> {

    public ModelRenderer body;
    public ModelRenderer ass;
    public ModelRenderer chest;
    public ModelRenderer lForeleg01;
    public ModelRenderer rForeleg01;
    public ModelRenderer bodyFur;
    public ModelRenderer lHindLeg01;
    public ModelRenderer rHindLeg01;
    public ModelRenderer tail;
    public ModelRenderer lHindLeg02;
    public ModelRenderer lHindLeg03;
    public ModelRenderer lHindHoof;
    public ModelRenderer rHindLeg02;
    public ModelRenderer rHindLeg03;
    public ModelRenderer rHindHoof;
    public ModelRenderer neck;
    public ModelRenderer mane03;
    public ModelRenderer mane04;
    public ModelRenderer head;
    public ModelRenderer mane01;
    public ModelRenderer mane02;
    public ModelRenderer mane05;
    public ModelRenderer mane03_1;
    public ModelRenderer muzzle;
    public ModelRenderer lowerJaw;
    public ModelRenderer lEar;
    public ModelRenderer rEar;
    public ModelRenderer lAntler01;
    public ModelRenderer rAntler01;
    public ModelRenderer lAntler02;
    public ModelRenderer lAntler03;
    public ModelRenderer lAntlerExtra01;
    public ModelRenderer lAntler04;
    public ModelRenderer lAntler05;
    public ModelRenderer lAntler06;
    public ModelRenderer lAntler07;
    public ModelRenderer lAntler08;
    public ModelRenderer lAntlerExtra02;
    public ModelRenderer lAntlerExtra09;
    public ModelRenderer lAntlerExtra03;
    public ModelRenderer lAntlerExtra04;
    public ModelRenderer lAntlerExtra08;
    public ModelRenderer lAntlerExtra05;
    public ModelRenderer lAntlerExtra04_1;
    public ModelRenderer lAntlerExtra07;
    public ModelRenderer rAntler02;
    public ModelRenderer rAntler03;
    public ModelRenderer rAntlerExtra01;
    public ModelRenderer rAntler04;
    public ModelRenderer rAntler05;
    public ModelRenderer rAntler06;
    public ModelRenderer rAntler07;
    public ModelRenderer rAntler08;
    public ModelRenderer rAntlerExtra02;
    public ModelRenderer rAntlerExtra09;
    public ModelRenderer rAntlerExtra03;
    public ModelRenderer rAntlerExtra04;
    public ModelRenderer rAntlerExtra08;
    public ModelRenderer lAntlerExtra05_1;
    public ModelRenderer rAntlerExtra04_1;
    public ModelRenderer rAntlerExtra07;
    public ModelRenderer lForeleg02;
    public ModelRenderer lForeleg03;
    public ModelRenderer lForeHoof;
    public ModelRenderer rForeleg02;
    public ModelRenderer rForeleg03;
    public ModelRenderer rForeHoof;

    public ModelDeer() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.head = new ModelRenderer(this, 88, 14);
        this.head.setRotationPoint(0.0F, 1.1F, -5.0F);
        this.head.addBox(-2.5F, -3.0F, -4.0F, 5, 7, 4, 0.0F);
        this.setRotateAngle(this.head, -0.31869712141416456F, 0.0F, 0.0F);
        this.rAntlerExtra07 = new ModelRenderer(this, 83, 43);
        this.rAntlerExtra07.mirror = true;
        this.rAntlerExtra07.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.rAntlerExtra07.addBox(0.0F, -0.6F, -2.5F, 0, 1, 3, 0.0F);
        this.setRotateAngle(this.rAntlerExtra07, 0.091106186954104F, 0.0F, 0.0F);
        this.mane01 = new ModelRenderer(this, 0, 50);
        this.mane01.setRotationPoint(0.0F, 1.6F, -4.4F);
        this.mane01.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F);
        this.setRotateAngle(this.mane01, -0.5009094953223726F, 0.0F, 0.0F);
        this.rAntler06 = new ModelRenderer(this, 104, 40);
        this.rAntler06.mirror = true;
        this.rAntler06.setRotationPoint(0.0F, 2.8F, 0.0F);
        this.rAntler06.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(this.rAntler06, 0.36425021489121656F, 0.0F, -0.18203784098300857F);
        this.lHindHoof = new ModelRenderer(this, 32, 12);
        this.lHindHoof.setRotationPoint(-0.0F, 7.1F, 0.3F);
        this.lHindHoof.addBox(-1.5F, 0.0F, -2.4F, 3, 2, 3, 0.0F);
        this.ass = new ModelRenderer(this, 0, 35);
        this.ass.setRotationPoint(0.0F, -0.3F, 12.3F);
        this.ass.addBox(-3.5F, -3.5F, 0.0F, 7, 7, 6, 0.0F);
        this.setRotateAngle(this.ass, -0.18203784098300857F, 0.0F, 0.0F);
        this.lForeleg02 = new ModelRenderer(this, 48, 14);
        this.lForeleg02.setRotationPoint(0.8F, 4.4F, 0.1F);
        this.lForeleg02.addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3, 0.0F);
        this.setRotateAngle(this.lForeleg02, 0.0F, 0.0F, 0.091106186954104F);
        this.rForeHoof = new ModelRenderer(this, 32, 12);
        this.rForeHoof.mirror = true;
        this.rForeHoof.setRotationPoint(-0.0F, 8.3F, 0.3F);
        this.rForeHoof.addBox(-1.5F, 0.0F, -2.4F, 3, 2, 3, 0.0F);
        this.mane05 = new ModelRenderer(this, 0, 58);
        this.mane05.setRotationPoint(0.0F, -1.5F, -3.7F);
        this.mane05.addBox(-2.0F, -1.0F, 0.0F, 4, 1, 5, 0.0F);
        this.setRotateAngle(this.mane05, 0.8651597102135892F, 0.0F, 0.0F);
        this.lAntlerExtra04 = new ModelRenderer(this, 94, 40);
        this.lAntlerExtra04.setRotationPoint(0.0F, -1.8F, 0.0F);
        this.lAntlerExtra04.addBox(-0.5F, -0.6F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(this.lAntlerExtra04, 0.045553093477052F, -0.136659280431156F, 0.0F);
        this.neck = new ModelRenderer(this, 88, 0);
        this.neck.setRotationPoint(0.0F, 0.3F, -4.0F);
        this.neck.addBox(-2.5F, -2.5F, -6.0F, 5, 5, 6, 0.0F);
        this.setRotateAngle(this.neck, -0.31869712141416456F, 0.0F, 0.0F);
        this.rAntlerExtra01 = new ModelRenderer(this, 94, 40);
        this.rAntlerExtra01.mirror = true;
        this.rAntlerExtra01.setRotationPoint(0.1F, -1.4F, 0.0F);
        this.rAntlerExtra01.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(this.rAntlerExtra01, 0.22759093446006054F, 0.091106186954104F, -0.22759093446006054F);
        this.lAntlerExtra09 = new ModelRenderer(this, 94, 40);
        this.lAntlerExtra09.setRotationPoint(0.9F, 4.4F, -1.1F);
        this.lAntlerExtra09.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(this.lAntlerExtra09, -0.27314402793711257F, 0.0F, 0.0F);
        this.mane03_1 = new ModelRenderer(this, 20, 58);
        this.mane03_1.setRotationPoint(0.0F, -1.9F, -2.0F);
        this.mane03_1.addBox(-2.5F, -1.0F, 0.0F, 5, 1, 5, 0.0F);
        this.setRotateAngle(this.mane03_1, 0.8196066167365371F, 0.0F, 0.0F);
        this.muzzle = new ModelRenderer(this, 88, 27);
        this.muzzle.setRotationPoint(0.0F, 3.7F, -2.2F);
        this.muzzle.addBox(-2.0F, 0.0F, -1.0F, 4, 3, 2, 0.0F);
        this.setRotateAngle(this.muzzle, 0.18203784098300857F, 0.0F, 0.0F);
        this.chest = new ModelRenderer(this, 0, 0);
        this.chest.setRotationPoint(0.0F, 0.8F, 2.4F);
        this.chest.addBox(-3.5F, -3.0F, -5.0F, 7, 6, 5, 0.0F);
        this.setRotateAngle(this.chest, -0.6829473363053812F, 0.0F, 0.0F);
        this.rAntler05 = new ModelRenderer(this, 104, 40);
        this.rAntler05.mirror = true;
        this.rAntler05.setRotationPoint(0.0F, 1.8F, 0.0F);
        this.rAntler05.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(this.rAntler05, 0.4553564018453205F, 0.0F, -0.18203784098300857F);
        this.rAntlerExtra02 = new ModelRenderer(this, 94, 40);
        this.rAntlerExtra02.mirror = true;
        this.rAntlerExtra02.setRotationPoint(0.0F, -2.9F, 0.0F);
        this.rAntlerExtra02.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.rAntlerExtra02, 0.18203784098300857F, 0.091106186954104F, 0.0F);
        this.rHindLeg02 = new ModelRenderer(this, 65, 15);
        this.rHindLeg02.mirror = true;
        this.rHindLeg02.setRotationPoint(-1.4F, 5.0F, -1.1F);
        this.rHindLeg02.addBox(-1.5F, 0.0F, -1.5F, 3, 7, 3, 0.0F);
        this.setRotateAngle(this.rHindLeg02, 0.9105382707654417F, 0.0F, 0.0F);
        this.lHindLeg03 = new ModelRenderer(this, 68, 30);
        this.lHindLeg03.setRotationPoint(0.1F, 6.4F, 0.5F);
        this.lHindLeg03.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(this.lHindLeg03, -0.5009094953223726F, 0.0F, 0.0F);
        this.lowerJaw = new ModelRenderer(this, 102, 28);
        this.lowerJaw.setRotationPoint(0.0F, 3.4F, -0.8F);
        this.lowerJaw.addBox(-2.0F, 0.0F, -0.5F, 4, 3, 1, 0.0F);
        this.lAntlerExtra08 = new ModelRenderer(this, 94, 40);
        this.lAntlerExtra08.setRotationPoint(0.0F, -2.7F, 0.0F);
        this.lAntlerExtra08.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.lAntlerExtra08, 0.27314402793711257F, 0.0F, 0.0F);
        this.lAntlerExtra05 = new ModelRenderer(this, 94, 40);
        this.lAntlerExtra05.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.lAntlerExtra05.addBox(-0.5F, -0.6F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(this.lAntlerExtra05, 0.091106186954104F, 0.0F, 0.0F);
        this.rAntler04 = new ModelRenderer(this, 104, 40);
        this.rAntler04.mirror = true;
        this.rAntler04.setRotationPoint(0.0F, -0.3F, -1.6F);
        this.rAntler04.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.rAntler04, -0.5918411493512771F, 0.22759093446006054F, 0.0F);
        this.lAntler03 = new ModelRenderer(this, 104, 40);
        this.lAntler03.setRotationPoint(-0.1F, -1.1F, 0.1F);
        this.lAntler03.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(this.lAntler03, -0.7740535232594852F, -0.31869712141416456F, 0.0F);
        this.lHindLeg02 = new ModelRenderer(this, 65, 15);
        this.lHindLeg02.setRotationPoint(1.4F, 5.0F, -1.1F);
        this.lHindLeg02.addBox(-1.5F, 0.0F, -1.5F, 3, 7, 3, 0.0F);
        this.setRotateAngle(this.lHindLeg02, 0.9105382707654417F, 0.0F, 0.0F);
        this.mane04 = new ModelRenderer(this, 72, 50);
        this.mane04.setRotationPoint(0.0F, 1.8F, -3.0F);
        this.mane04.addBox(-3.0F, -1.0F, 0.0F, 6, 2, 6, 0.0F);
        this.setRotateAngle(this.mane04, -0.5462880558742251F, 0.0F, 0.0F);
        this.rForeleg02 = new ModelRenderer(this, 48, 14);
        this.rForeleg02.mirror = true;
        this.rForeleg02.setRotationPoint(-0.8F, 4.4F, 0.1F);
        this.rForeleg02.addBox(-1.0F, 0.0F, -1.5F, 2, 3, 3, 0.0F);
        this.setRotateAngle(this.rForeleg02, 0.0F, 0.0F, -0.091106186954104F);
        this.rHindLeg01 = new ModelRenderer(this, 64, 0);
        this.rHindLeg01.mirror = true;
        this.rHindLeg01.setRotationPoint(-2.5F, -1.1F, 3.3F);
        this.rHindLeg01.addBox(-3.0F, -1.9F, -2.0F, 3, 8, 5, 0.0F);
        this.setRotateAngle(this.rHindLeg01, -0.22759093446006054F, 0.0F, 0.0F);
        this.rHindHoof = new ModelRenderer(this, 32, 12);
        this.rHindHoof.mirror = true;
        this.rHindHoof.setRotationPoint(-0.0F, 7.1F, 0.3F);
        this.rHindHoof.addBox(-1.5F, 0.0F, -2.4F, 3, 2, 3, 0.0F);
        this.lAntler02 = new ModelRenderer(this, 104, 40);
        this.lAntler02.setRotationPoint(0.0F, -3.7F, -0.1F);
        this.lAntler02.addBox(-0.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.lAntler02, 0.091106186954104F, -0.18203784098300857F, 0.0F);
        this.lAntlerExtra03 = new ModelRenderer(this, 94, 40);
        this.lAntlerExtra03.setRotationPoint(0.0F, -1.8F, 0.0F);
        this.lAntlerExtra03.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(this.lAntlerExtra03, 0.22759093446006054F, 0.0F, 0.0F);
        this.rAntler01 = new ModelRenderer(this, 104, 40);
        this.rAntler01.mirror = true;
        this.rAntler01.setRotationPoint(-1.7F, 0.4F, -3.7F);
        this.rAntler01.addBox(-0.5F, -3.5F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(this.rAntler01, 0.36425021489121656F, 0.0F, -0.18203784098300857F);
        this.lAntlerExtra01 = new ModelRenderer(this, 94, 40);
        this.lAntlerExtra01.setRotationPoint(-0.1F, -1.4F, 0.0F);
        this.lAntlerExtra01.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(this.lAntlerExtra01, 0.22759093446006054F, -0.091106186954104F, 0.22759093446006054F);
        this.lAntler01 = new ModelRenderer(this, 104, 40);
        this.lAntler01.setRotationPoint(1.7F, 0.4F, -3.7F);
        this.lAntler01.addBox(-0.5F, -3.5F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(this.lAntler01, 0.36425021489121656F, 0.0F, 0.18203784098300857F);
        this.rAntlerExtra09 = new ModelRenderer(this, 94, 40);
        this.rAntlerExtra09.mirror = true;
        this.rAntlerExtra09.setRotationPoint(-0.9F, 4.4F, -1.1F);
        this.rAntlerExtra09.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(this.rAntlerExtra09, -0.27314402793711257F, 0.0F, 0.0F);
        this.mane02 = new ModelRenderer(this, 20, 50);
        this.mane02.setRotationPoint(0.0F, 1.4F, -3.4F);
        this.mane02.addBox(-2.5F, 0.0F, 0.0F, 5, 1, 6, 0.0F);
        this.setRotateAngle(this.mane02, -0.40980330836826856F, 0.0F, 0.0F);
        this.lAntler04 = new ModelRenderer(this, 104, 40);
        this.lAntler04.setRotationPoint(0.0F, -0.3F, -1.6F);
        this.lAntler04.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.lAntler04, -0.5918411493512771F, -0.22759093446006054F, 0.0F);
        this.lHindLeg01 = new ModelRenderer(this, 64, 0);
        this.lHindLeg01.setRotationPoint(2.5F, -1.1F, 3.3F);
        this.lHindLeg01.addBox(0.0F, -1.9F, -2.0F, 3, 8, 5, 0.0F);
        this.setRotateAngle(this.lHindLeg01, -0.22759093446006054F, 0.0F, 0.0F);
        this.rAntler02 = new ModelRenderer(this, 104, 40);
        this.rAntler02.mirror = true;
        this.rAntler02.setRotationPoint(0.0F, -3.7F, -0.1F);
        this.rAntler02.addBox(-0.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.rAntler02, 0.136659280431156F, 0.18203784098300857F, 0.0F);
        this.lForeHoof = new ModelRenderer(this, 32, 12);
        this.lForeHoof.setRotationPoint(-0.0F, 8.3F, 0.3F);
        this.lForeHoof.addBox(-1.5F, 0.0F, -2.4F, 3, 2, 3, 0.0F);
        this.lForeleg03 = new ModelRenderer(this, 50, 25);
        this.lForeleg03.setRotationPoint(0.0F, 2.7F, 0.0F);
        this.lForeleg03.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(this.lForeleg03, -0.136659280431156F, 0.0F, 0.0F);
        this.rAntlerExtra03 = new ModelRenderer(this, 94, 40);
        this.rAntlerExtra03.mirror = true;
        this.rAntlerExtra03.setRotationPoint(0.0F, -1.8F, 0.0F);
        this.rAntlerExtra03.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(this.rAntlerExtra03, 0.22759093446006054F, 0.0F, 0.0F);
        this.rAntler07 = new ModelRenderer(this, 114, 35);
        this.rAntler07.mirror = true;
        this.rAntler07.setRotationPoint(0.0F, 0.4F, 0.6F);
        this.rAntler07.addBox(0.0F, -2.0F, -2.3F, 0, 4, 2, 0.0F);
        this.setRotateAngle(this.rAntler07, -0.18203784098300857F, 0.0F, 0.0F);
        this.lAntler06 = new ModelRenderer(this, 104, 40);
        this.lAntler06.setRotationPoint(0.0F, 2.8F, 0.0F);
        this.lAntler06.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(this.lAntler06, 0.36425021489121656F, 0.0F, 0.18203784098300857F);
        this.lEar = new ModelRenderer(this, 0, 13);
        this.lEar.setRotationPoint(2.3F, -1.0F, -3.0F);
        this.lEar.addBox(-1.0F, -0.7F, -3.1F, 2, 1, 3, 0.0F);
        this.setRotateAngle(this.lEar, 0.27314402793711257F, -0.8651597102135892F, 0.0F);
        this.lAntlerExtra07 = new ModelRenderer(this, 83, 43);
        this.lAntlerExtra07.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.lAntlerExtra07.addBox(0.0F, -0.6F, -2.5F, 0, 1, 3, 0.0F);
        this.setRotateAngle(this.lAntlerExtra07, 0.091106186954104F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 13);
        this.body.setRotationPoint(0.0F, 6.5F, -9.2F);
        this.body.addBox(-4.0F, -3.5F, 0.0F, 8, 7, 13, 0.0F);
        this.rHindLeg03 = new ModelRenderer(this, 68, 30);
        this.rHindLeg03.mirror = true;
        this.rHindLeg03.setRotationPoint(-0.1F, 6.4F, 0.5F);
        this.rHindLeg03.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(this.rHindLeg03, -0.5009094953223726F, 0.0F, 0.0F);
        this.lAntler08 = new ModelRenderer(this, 114, 41);
        this.lAntler08.setRotationPoint(0.0F, 3.6F, 0.4F);
        this.lAntler08.addBox(-0.2F, -1.8F, -1.3F, 0, 3, 1, 0.0F);
        this.setRotateAngle(this.lAntler08, 0.27314402793711257F, 0.0F, 0.136659280431156F);
        this.rForeleg03 = new ModelRenderer(this, 50, 25);
        this.rForeleg03.mirror = true;
        this.rForeleg03.setRotationPoint(0.0F, 2.7F, 0.0F);
        this.rForeleg03.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(this.rForeleg03, -0.136659280431156F, 0.0F, 0.0F);
        this.rForeleg01 = new ModelRenderer(this, 45, 0);
        this.rForeleg01.mirror = true;
        this.rForeleg01.setRotationPoint(-3.1F, 0.6F, 2.3F);
        this.rForeleg01.addBox(-2.0F, -2.4F, -2.5F, 3, 7, 5, 0.0F);
        this.setRotateAngle(this.rForeleg01, 0.136659280431156F, 0.0F, 0.091106186954104F);
        this.lAntler05 = new ModelRenderer(this, 104, 40);
        this.lAntler05.setRotationPoint(0.0F, 1.8F, 0.0F);
        this.lAntler05.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(this.lAntler05, 0.4553564018453205F, 0.0F, 0.18203784098300857F);
        this.lAntlerExtra05_1 = new ModelRenderer(this, 94, 40);
        this.lAntlerExtra05_1.mirror = true;
        this.lAntlerExtra05_1.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.lAntlerExtra05_1.addBox(-0.5F, -0.6F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(this.lAntlerExtra05_1, 0.091106186954104F, 0.0F, 0.0F);
        this.lAntler07 = new ModelRenderer(this, 114, 35);
        this.lAntler07.setRotationPoint(0.0F, 0.4F, 0.6F);
        this.lAntler07.addBox(0.0F, -2.0F, -2.3F, 0, 4, 2, 0.0F);
        this.setRotateAngle(this.lAntler07, -0.18203784098300857F, 0.0F, 0.0F);
        this.lAntlerExtra04_1 = new ModelRenderer(this, 83, 37);
        this.lAntlerExtra04_1.setRotationPoint(0.0F, -1.0F, -0.6F);
        this.lAntlerExtra04_1.addBox(0.0F, -1.6F, -3.0F, 0, 2, 3, 0.0F);
        this.setRotateAngle(this.lAntlerExtra04_1, 0.045553093477052F, 0.0F, 0.0F);
        this.tail = new ModelRenderer(this, 33, 0);
        this.tail.setRotationPoint(0.0F, -2.7F, 5.4F);
        this.tail.addBox(-1.5F, 0.0F, -1.0F, 3, 4, 2, 0.0F);
        this.setRotateAngle(this.tail, 0.5918411493512771F, 0.0F, 0.0F);
        this.rAntler03 = new ModelRenderer(this, 104, 40);
        this.rAntler03.mirror = true;
        this.rAntler03.setRotationPoint(0.1F, -1.1F, 0.1F);
        this.rAntler03.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(this.rAntler03, -0.7740535232594852F, 0.31869712141416456F, 0.0F);
        this.rAntler08 = new ModelRenderer(this, 114, 41);
        this.rAntler08.mirror = true;
        this.rAntler08.setRotationPoint(0.0F, 3.6F, 0.4F);
        this.rAntler08.addBox(0.2F, -1.8F, -1.3F, 0, 3, 1, 0.0F);
        this.setRotateAngle(this.rAntler08, 0.27314402793711257F, 0.0F, -0.136659280431156F);
        this.rAntlerExtra08 = new ModelRenderer(this, 94, 40);
        this.rAntlerExtra08.mirror = true;
        this.rAntlerExtra08.setRotationPoint(0.0F, -2.7F, 0.0F);
        this.rAntlerExtra08.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.rAntlerExtra08, 0.27314402793711257F, 0.0F, 0.0F);
        this.bodyFur = new ModelRenderer(this, 94, 52);
        this.bodyFur.setRotationPoint(0.0F, 3.4F, 1.3F);
        this.bodyFur.addBox(-3.0F, 0.0F, 0.0F, 6, 2, 7, 0.0F);
        this.mane03 = new ModelRenderer(this, 46, 50);
        this.mane03.setRotationPoint(0.0F, 1.8F, -5.2F);
        this.mane03.addBox(-3.0F, 0.0F, 0.0F, 6, 1, 6, 0.0F);
        this.setRotateAngle(this.mane03, -0.5462880558742251F, 0.0F, 0.0F);
        this.lForeleg01 = new ModelRenderer(this, 45, 0);
        this.lForeleg01.setRotationPoint(3.1F, 0.6F, 2.3F);
        this.lForeleg01.addBox(-1.0F, -2.4F, -2.5F, 3, 7, 5, 0.0F);
        this.setRotateAngle(this.lForeleg01, 0.136659280431156F, 0.0F, -0.091106186954104F);
        this.rAntlerExtra04_1 = new ModelRenderer(this, 83, 37);
        this.rAntlerExtra04_1.mirror = true;
        this.rAntlerExtra04_1.setRotationPoint(0.0F, -1.0F, -0.6F);
        this.rAntlerExtra04_1.addBox(0.0F, -1.6F, -3.0F, 0, 2, 3, 0.0F);
        this.setRotateAngle(this.rAntlerExtra04_1, 0.045553093477052F, 0.0F, 0.0F);
        this.rEar = new ModelRenderer(this, 0, 13);
        this.rEar.mirror = true;
        this.rEar.setRotationPoint(-2.3F, -1.0F, -3.0F);
        this.rEar.addBox(-1.0F, -0.7F, -3.1F, 2, 1, 3, 0.0F);
        this.setRotateAngle(this.rEar, 0.27314402793711257F, 0.8651597102135892F, 0.0F);
        this.lAntlerExtra02 = new ModelRenderer(this, 94, 40);
        this.lAntlerExtra02.setRotationPoint(0.0F, -2.9F, 0.0F);
        this.lAntlerExtra02.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.lAntlerExtra02, 0.18203784098300857F, -0.091106186954104F, 0.0F);
        this.rAntlerExtra04 = new ModelRenderer(this, 94, 40);
        this.rAntlerExtra04.mirror = true;
        this.rAntlerExtra04.setRotationPoint(0.0F, -1.8F, 0.0F);
        this.rAntlerExtra04.addBox(-0.5F, -0.6F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(this.rAntlerExtra04, 0.045553093477052F, 0.136659280431156F, 0.0F);
        this.neck.addChild(this.head);
        this.rAntlerExtra04_1.addChild(this.rAntlerExtra07);
        this.neck.addChild(this.mane01);
        this.rAntler05.addChild(this.rAntler06);
        this.lHindLeg03.addChild(this.lHindHoof);
        this.body.addChild(this.ass);
        this.lForeleg01.addChild(this.lForeleg02);
        this.rForeleg03.addChild(this.rForeHoof);
        this.neck.addChild(this.mane05);
        this.lAntlerExtra02.addChild(this.lAntlerExtra04);
        this.chest.addChild(this.neck);
        this.rAntler02.addChild(this.rAntlerExtra01);
        this.lAntlerExtra01.addChild(this.lAntlerExtra09);
        this.neck.addChild(this.mane03_1);
        this.head.addChild(this.muzzle);
        this.body.addChild(this.chest);
        this.rAntler04.addChild(this.rAntler05);
        this.rAntlerExtra01.addChild(this.rAntlerExtra02);
        this.rHindLeg01.addChild(this.rHindLeg02);
        this.lHindLeg02.addChild(this.lHindLeg03);
        this.head.addChild(this.lowerJaw);
        this.lAntlerExtra03.addChild(this.lAntlerExtra08);
        this.lAntlerExtra04.addChild(this.lAntlerExtra05);
        this.rAntler03.addChild(this.rAntler04);
        this.lAntler02.addChild(this.lAntler03);
        this.lHindLeg01.addChild(this.lHindLeg02);
        this.chest.addChild(this.mane04);
        this.rForeleg01.addChild(this.rForeleg02);
        this.ass.addChild(this.rHindLeg01);
        this.rHindLeg03.addChild(this.rHindHoof);
        this.lAntler01.addChild(this.lAntler02);
        this.lAntlerExtra02.addChild(this.lAntlerExtra03);
        this.head.addChild(this.rAntler01);
        this.lAntler02.addChild(this.lAntlerExtra01);
        this.head.addChild(this.lAntler01);
        this.rAntlerExtra01.addChild(this.rAntlerExtra09);
        this.neck.addChild(this.mane02);
        this.lAntler03.addChild(this.lAntler04);
        this.ass.addChild(this.lHindLeg01);
        this.rAntler01.addChild(this.rAntler02);
        this.lForeleg03.addChild(this.lForeHoof);
        this.lForeleg02.addChild(this.lForeleg03);
        this.rAntlerExtra02.addChild(this.rAntlerExtra03);
        this.rAntler05.addChild(this.rAntler07);
        this.lAntler05.addChild(this.lAntler06);
        this.head.addChild(this.lEar);
        this.lAntlerExtra04_1.addChild(this.lAntlerExtra07);
        this.rHindLeg02.addChild(this.rHindLeg03);
        this.lAntler05.addChild(this.lAntler08);
        this.rForeleg02.addChild(this.rForeleg03);
        this.body.addChild(this.rForeleg01);
        this.lAntler04.addChild(this.lAntler05);
        this.rAntlerExtra04.addChild(this.lAntlerExtra05_1);
        this.lAntler05.addChild(this.lAntler07);
        this.lAntlerExtra04.addChild(this.lAntlerExtra04_1);
        this.ass.addChild(this.tail);
        this.rAntler02.addChild(this.rAntler03);
        this.rAntler05.addChild(this.rAntler08);
        this.rAntlerExtra03.addChild(this.rAntlerExtra08);
        this.body.addChild(this.bodyFur);
        this.chest.addChild(this.mane03);
        this.body.addChild(this.lForeleg01);
        this.rAntlerExtra04.addChild(this.rAntlerExtra04_1);
        this.head.addChild(this.rEar);
        this.lAntlerExtra01.addChild(this.lAntlerExtra02);
        this.rAntlerExtra02.addChild(this.rAntlerExtra04);
    }

    @Override
    public void render(T entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    @Override
    public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
            float headPitch, float scaleFactor) {
        float f = limbSwing;
        float f1 = limbSwingAmount;

        this.lForeleg01.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 + 0.136659280431156F;
        this.rForeleg01.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1 + 0.136659280431156F;
        this.rHindLeg01.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 - 0.22759093446006054F;
        this.lHindLeg01.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1 - 0.22759093446006054F;

        if (entity instanceof MobEntity) {
            this.chest.rotateAngleX = ModelBetterAnimals.getHeadPitch((MobEntity) entity) * 0.017453292F - 13;
            this.chest.rotateAngleY = ModelBetterAnimals.getHeadYaw((MobEntity) entity) * 0.017453292F * 0.5F;
        }

        if(entity instanceof EntityDeer) {
            EntityDeer deer = (EntityDeer) entity;
            float eatTime = deer.getEatTime();
            if(eatTime > 0) {
                this.chest.rotateAngleX = (float) Math.toRadians(55F) - 0.6829473363053812F;
                this.neck.rotateAngleX = (float) Math.toRadians(60F) - 0.31869712141416456F;
                this.head.rotateAngleX = -0.31869712141416456F - (float) Math.toRadians(45F);
                this.lowerJaw.rotateAngleX = (float) Math.toRadians((eatTime % 20F)) + 0.1F;
            } else {
                this.chest.rotateAngleX = -0.6829473363053812F;
                this.neck.rotateAngleX = headPitch * 0.017453292F - 0.31869712141416456F;
                this.head.rotateAngleX = -0.31869712141416456F;
                this.lowerJaw.rotateAngleX = 0F;
            }
        }

        super.setRotationAngles(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    @Override
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
