package its_meow.betteranimalsplus.client.model;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * moose_head - cybercat5555
 * Created using Tabula 7.0.1
 */
public class ModelMooseHead extends EntityModel<Entity> {
    public ModelRenderer neck;
    public ModelRenderer head;
    public ModelRenderer snout;
    public ModelRenderer throat;
    public ModelRenderer snoutSlope;
    public ModelRenderer lEar;
    public ModelRenderer rEar;
    public ModelRenderer lAntler00;
    public ModelRenderer rAntler00;
    public ModelRenderer beard;
    public ModelRenderer lowerJaw;
    public ModelRenderer lAntler01a;
    public ModelRenderer lAntler01b;
    public ModelRenderer lAntler01c;
    public ModelRenderer lAntler01e;
    public ModelRenderer lAntler02a;
    public ModelRenderer lAntler01d;
    public ModelRenderer lAntler03a;
    public ModelRenderer lAntler04a;
    public ModelRenderer lAntler05a;
    public ModelRenderer lAntler06a;
    public ModelRenderer lAntler07a;
    public ModelRenderer lAntler08a;
    public ModelRenderer lAntler09a;
    public ModelRenderer lAntler07b;
    public ModelRenderer lAntler08b;
    public ModelRenderer lAntler09b;
    public ModelRenderer lAntler04b;
    public ModelRenderer lAntler05b;
    public ModelRenderer lAntler06b;
    public ModelRenderer rAntler01a;
    public ModelRenderer rAntler01b;
    public ModelRenderer rAntler01c;
    public ModelRenderer rAntler01e;
    public ModelRenderer rAntler02a;
    public ModelRenderer rAntler01d;
    public ModelRenderer rAntler03a;
    public ModelRenderer rAntler04a;
    public ModelRenderer rAntler05a;
    public ModelRenderer rAntler06a;
    public ModelRenderer rAntler07a;
    public ModelRenderer rAntler08a;
    public ModelRenderer rAntler09a;
    public ModelRenderer rAntler07b;
    public ModelRenderer rAntler08b;
    public ModelRenderer rAntler09b;
    public ModelRenderer rAntler04b;
    public ModelRenderer rAntler05b;
    public ModelRenderer rAntler06b;

    public ModelMooseHead() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.rAntler06a = new ModelRenderer(this, 84, 57);
        this.rAntler06a.mirror = true;
        this.rAntler06a.setRotationPoint(-1.9F, 0.0F, 5.0F);
        this.rAntler06a.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rAntler06a, -0.7853981633974483F, -0.17453292519943295F, -1.0471975511965976F);
        this.throat = new ModelRenderer(this, 102, 47);
        this.throat.setRotationPoint(0.0F, 1.6F, -5.2F);
        this.throat.addBox(-2.5F, 0.6F, -2.7F, 5, 1, 3, 0.0F);
        this.lAntler08b = new ModelRenderer(this, 84, 50);
        this.lAntler08b.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.lAntler08b.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lAntler08b, 0.0F, 0.0F, -0.3665191429188092F);
        this.rAntler05b = new ModelRenderer(this, 84, 57);
        this.rAntler05b.mirror = true;
        this.rAntler05b.setRotationPoint(0.0F, -3.9F, 0.0F);
        this.rAntler05b.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rAntler05b, 0.0F, 0.0F, 0.3665191429188092F);
        this.snoutSlope = new ModelRenderer(this, 78, 36);
        this.snoutSlope.setRotationPoint(0.0F, -1.6F, -5.0F);
        this.snoutSlope.addBox(-2.0F, -1.3F, -6.6F, 4, 3, 7, 0.0F);
        this.setRotateAngle(snoutSlope, 0.17453292519943295F, 0.0F, 0.0F);
        this.rAntler05a = new ModelRenderer(this, 84, 57);
        this.rAntler05a.mirror = true;
        this.rAntler05a.setRotationPoint(-1.9F, 0.0F, 3.1F);
        this.rAntler05a.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(rAntler05a, -0.5235987755982988F, -0.17453292519943295F, -1.1344640137963142F);
        this.rAntler07a = new ModelRenderer(this, 84, 50);
        this.rAntler07a.mirror = true;
        this.rAntler07a.setRotationPoint(-1.9F, 0.0F, 2.8F);
        this.rAntler07a.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rAntler07a, -0.7853981633974483F, -0.17453292519943295F, -1.1344640137963142F);
        this.rAntler06b = new ModelRenderer(this, 84, 57);
        this.rAntler06b.mirror = true;
        this.rAntler06b.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.rAntler06b.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rAntler06b, 0.0F, 0.0F, 0.3665191429188092F);
        this.rAntler01d = new ModelRenderer(this, 84, 57);
        this.rAntler01d.mirror = true;
        this.rAntler01d.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.rAntler01d.addBox(-0.5F, -0.9F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(rAntler01d, 0.0F, 0.0F, 0.3665191429188092F);
        this.rAntler09b = new ModelRenderer(this, 84, 50);
        this.rAntler09b.mirror = true;
        this.rAntler09b.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.rAntler09b.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rAntler09b, 0.0F, 0.0F, 0.3665191429188092F);
        this.rAntler01b = new ModelRenderer(this, 84, 57);
        this.rAntler01b.mirror = true;
        this.rAntler01b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rAntler01b.addBox(-5.0F, -0.2F, -0.5F, 5, 1, 1, 0.0F);
        this.beard = new ModelRenderer(this, 56, 46);
        this.beard.setRotationPoint(0.0F, 1.6F, 1.7F);
        this.beard.addBox(-1.5F, -0.2F, -3.8F, 3, 5, 7, 0.0F);
        this.setRotateAngle(beard, -0.5061454830783556F, 0.0F, 0.0F);
        this.lAntler07b = new ModelRenderer(this, 84, 50);
        this.lAntler07b.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.lAntler07b.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lAntler07b, 0.0F, 0.0F, -0.3665191429188092F);
        this.rAntler01a = new ModelRenderer(this, 84, 57);
        this.rAntler01a.mirror = true;
        this.rAntler01a.setRotationPoint(-2.9F, 0.0F, 0.1F);
        this.rAntler01a.addBox(-5.0F, -0.8F, -0.5F, 5, 1, 1, 0.0F);
        this.setRotateAngle(rAntler01a, 0.0F, -0.4363323129985824F, -0.13962634015954636F);
        this.rAntler03a = new ModelRenderer(this, 78, 47);
        this.rAntler03a.mirror = true;
        this.rAntler03a.setRotationPoint(-0.4F, 0.0F, 5.3F);
        this.rAntler03a.addBox(-2.8F, -0.61F, -0.7F, 5, 1, 7, 0.0F);
        this.setRotateAngle(rAntler03a, 0.20943951023931953F, 0.4363323129985824F, 0.0F);
        this.rAntler04a = new ModelRenderer(this, 84, 57);
        this.rAntler04a.mirror = true;
        this.rAntler04a.setRotationPoint(-1.9F, 0.0F, 1.1F);
        this.rAntler04a.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rAntler04a, -0.3141592653589793F, -0.17453292519943295F, -1.1344640137963142F);
        this.lAntler00 = new ModelRenderer(this, 84, 57);
        this.lAntler00.setRotationPoint(2.0F, -2.4F, -2.1F);
        this.lAntler00.addBox(0.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(lAntler00, 0.0F, 0.17453292519943295F, -0.3490658503988659F);
        this.lAntler06a = new ModelRenderer(this, 84, 57);
        this.lAntler06a.setRotationPoint(1.9F, 0.0F, 5.0F);
        this.lAntler06a.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lAntler06a, -0.7853981633974483F, 0.17453292519943295F, 1.0471975511965976F);
        this.lAntler08a = new ModelRenderer(this, 84, 50);
        this.lAntler08a.setRotationPoint(1.9F, -0.1F, 5.3F);
        this.lAntler08a.addBox(-0.5F, -2.2F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lAntler08a, -1.0471975511965976F, 0.0F, 1.48352986419518F);
        this.lAntler09a = new ModelRenderer(this, 84, 50);
        this.lAntler09a.setRotationPoint(0.3F, -0.1F, 5.7F);
        this.lAntler09a.addBox(-0.5F, -2.2F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lAntler09a, -1.48352986419518F, -0.17453292519943295F, 1.53588974175501F);
        this.lAntler03a = new ModelRenderer(this, 78, 47);
        this.lAntler03a.setRotationPoint(0.4F, 0.0F, 5.3F);
        this.lAntler03a.addBox(-2.2F, -0.61F, -0.7F, 5, 1, 7, 0.0F);
        this.setRotateAngle(lAntler03a, 0.20943951023931953F, -0.4363323129985824F, 0.0F);
        this.lAntler09b = new ModelRenderer(this, 84, 50);
        this.lAntler09b.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.lAntler09b.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lAntler09b, 0.0F, 0.0F, -0.3665191429188092F);
        this.rAntler09a = new ModelRenderer(this, 84, 50);
        this.rAntler09a.mirror = true;
        this.rAntler09a.setRotationPoint(-0.3F, -0.1F, 5.7F);
        this.rAntler09a.addBox(-0.5F, -2.2F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rAntler09a, -1.48352986419518F, 0.17453292519943295F, -1.53588974175501F);
        this.lAntler01b = new ModelRenderer(this, 84, 57);
        this.lAntler01b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lAntler01b.addBox(0.0F, -0.2F, -0.5F, 5, 1, 1, 0.0F);
        this.lAntler01e = new ModelRenderer(this, 84, 57);
        this.lAntler01e.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.lAntler01e.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(lAntler01e, 0.5235987755982988F, 0.0F, 0.47123889803846897F);
        this.lAntler01a = new ModelRenderer(this, 84, 57);
        this.lAntler01a.setRotationPoint(2.9F, 0.0F, 0.1F);
        this.lAntler01a.addBox(0.0F, -0.8F, -0.5F, 5, 1, 1, 0.0F);
        this.setRotateAngle(lAntler01a, 0.0F, 0.4363323129985824F, 0.13962634015954636F);
        this.lAntler05a = new ModelRenderer(this, 84, 57);
        this.lAntler05a.setRotationPoint(1.9F, 0.0F, 3.1F);
        this.lAntler05a.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(lAntler05a, -0.5235987755982988F, 0.17453292519943295F, 1.1344640137963142F);
        this.rAntler04b = new ModelRenderer(this, 84, 57);
        this.rAntler04b.mirror = true;
        this.rAntler04b.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.rAntler04b.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rAntler04b, 0.0F, 0.0F, 0.3665191429188092F);
        this.rAntler08a = new ModelRenderer(this, 84, 50);
        this.rAntler08a.mirror = true;
        this.rAntler08a.setRotationPoint(-1.9F, -0.1F, 5.3F);
        this.rAntler08a.addBox(-0.5F, -2.2F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rAntler08a, -1.0471975511965976F, 0.0F, -1.48352986419518F);
        this.rAntler07b = new ModelRenderer(this, 84, 50);
        this.rAntler07b.mirror = true;
        this.rAntler07b.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.rAntler07b.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rAntler07b, 0.0F, 0.0F, 0.3665191429188092F);
        this.rAntler01c = new ModelRenderer(this, 84, 57);
        this.rAntler01c.mirror = true;
        this.rAntler01c.setRotationPoint(-4.9F, 0.0F, 0.0F);
        this.rAntler01c.addBox(-0.5F, -3.2F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rAntler01c, 0.3490658503988659F, -0.17453292519943295F, -1.1344640137963142F);
        this.lAntler06b = new ModelRenderer(this, 84, 57);
        this.lAntler06b.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.lAntler06b.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lAntler06b, 0.0F, 0.0F, -0.3665191429188092F);
        this.neck = new ModelRenderer(this, 88, 0);
        this.neck.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck.addBox(-2.5F, -2.5F, -7.5F, 5, 7, 7, 0.0F);
        this.snout = new ModelRenderer(this, 104, 36);
        this.snout.setRotationPoint(0.0F, 0.5F, -5.1F);
        this.snout.addBox(-2.5F, -1.2F, -5.9F, 5, 3, 6, 0.0F);
        this.rEar = new ModelRenderer(this, 0, 0);
        this.rEar.mirror = true;
        this.rEar.setRotationPoint(-2.0F, -2.3F, 0.0F);
        this.rEar.addBox(-4.0F, -1.5F, -0.5F, 4, 3, 1, 0.0F);
        this.setRotateAngle(rEar, 0.22689280275926282F, 0.0F, 0.9599310885968813F);
        this.lEar = new ModelRenderer(this, 0, 0);
        this.lEar.setRotationPoint(2.0F, -2.3F, 0.0F);
        this.lEar.addBox(0.0F, -1.5F, -0.5F, 4, 3, 1, 0.0F);
        this.setRotateAngle(lEar, 0.22689280275926282F, 0.0F, -0.9599310885968813F);
        this.lAntler05b = new ModelRenderer(this, 84, 57);
        this.lAntler05b.setRotationPoint(0.0F, -3.9F, 0.0F);
        this.lAntler05b.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lAntler05b, 0.0F, 0.0F, -0.3665191429188092F);
        this.rAntler02a = new ModelRenderer(this, 83, 57);
        this.rAntler02a.mirror = true;
        this.rAntler02a.setRotationPoint(-2.8F, 0.0F, -0.3F);
        this.rAntler02a.addBox(-2.5F, -0.6F, 0.4F, 4, 1, 5, 0.0F);
        this.setRotateAngle(rAntler02a, 0.4363323129985824F, 0.08726646259971647F, 0.0F);
        this.head = new ModelRenderer(this, 88, 16);
        this.head.setRotationPoint(0.0F, 0.0F, -6.2F);
        this.head.addBox(-3.0F, -3.0F, -5.1F, 6, 7, 6, 0.0F);
        this.setRotateAngle(head, 0.5235987755982988F, 0.0F, 0.0F);
        this.lowerJaw = new ModelRenderer(this, 102, 54);
        this.lowerJaw.setRotationPoint(0.0F, 1.1F, -1.9F);
        this.lowerJaw.addBox(-2.0F, -0.6F, -3.4F, 4, 1, 3, 0.0F);
        this.lAntler07a = new ModelRenderer(this, 84, 50);
        this.lAntler07a.setRotationPoint(1.9F, 0.0F, 2.8F);
        this.lAntler07a.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lAntler07a, -0.7853981633974483F, 0.17453292519943295F, 1.1344640137963142F);
        this.lAntler04b = new ModelRenderer(this, 84, 57);
        this.lAntler04b.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.lAntler04b.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lAntler04b, 0.0F, 0.0F, -0.3665191429188092F);
        this.rAntler08b = new ModelRenderer(this, 84, 50);
        this.rAntler08b.mirror = true;
        this.rAntler08b.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.rAntler08b.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rAntler08b, 0.0F, 0.0F, 0.3665191429188092F);
        this.lAntler02a = new ModelRenderer(this, 83, 57);
        this.lAntler02a.setRotationPoint(2.8F, 0.0F, -0.3F);
        this.lAntler02a.addBox(-1.5F, -0.6F, 0.4F, 4, 1, 5, 0.0F);
        this.setRotateAngle(lAntler02a, 0.4363323129985824F, -0.08726646259971647F, 0.0F);
        this.lAntler01d = new ModelRenderer(this, 84, 57);
        this.lAntler01d.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.lAntler01d.addBox(-0.5F, -0.9F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(lAntler01d, 0.0F, 0.0F, -0.3665191429188092F);
        this.rAntler00 = new ModelRenderer(this, 84, 57);
        this.rAntler00.mirror = true;
        this.rAntler00.setRotationPoint(-2.0F, -2.4F, -2.1F);
        this.rAntler00.addBox(-3.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(rAntler00, 0.0F, -0.17453292519943295F, 0.3490658503988659F);
        this.rAntler01e = new ModelRenderer(this, 84, 57);
        this.rAntler01e.mirror = true;
        this.rAntler01e.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.rAntler01e.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(rAntler01e, 0.5235987755982988F, 0.0F, -0.47123889803846897F);
        this.lAntler01c = new ModelRenderer(this, 84, 57);
        this.lAntler01c.setRotationPoint(4.9F, 0.0F, 0.0F);
        this.lAntler01c.addBox(-0.5F, -3.2F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lAntler01c, 0.3490658503988659F, 0.17453292519943295F, 1.1344640137963142F);
        this.lAntler04a = new ModelRenderer(this, 84, 57);
        this.lAntler04a.setRotationPoint(1.9F, 0.0F, 1.1F);
        this.lAntler04a.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lAntler04a, -0.3141592653589793F, 0.17453292519943295F, 1.1344640137963142F);
        this.rAntler02a.addChild(this.rAntler06a);
        this.head.addChild(this.throat);
        this.lAntler08a.addChild(this.lAntler08b);
        this.rAntler05a.addChild(this.rAntler05b);
        this.head.addChild(this.snoutSlope);
        this.rAntler02a.addChild(this.rAntler05a);
        this.rAntler03a.addChild(this.rAntler07a);
        this.rAntler06a.addChild(this.rAntler06b);
        this.rAntler01c.addChild(this.rAntler01d);
        this.rAntler09a.addChild(this.rAntler09b);
        this.rAntler01a.addChild(this.rAntler01b);
        this.throat.addChild(this.beard);
        this.lAntler07a.addChild(this.lAntler07b);
        this.rAntler00.addChild(this.rAntler01a);
        this.rAntler02a.addChild(this.rAntler03a);
        this.rAntler02a.addChild(this.rAntler04a);
        this.head.addChild(this.lAntler00);
        this.lAntler02a.addChild(this.lAntler06a);
        this.lAntler03a.addChild(this.lAntler08a);
        this.lAntler03a.addChild(this.lAntler09a);
        this.lAntler02a.addChild(this.lAntler03a);
        this.lAntler09a.addChild(this.lAntler09b);
        this.rAntler03a.addChild(this.rAntler09a);
        this.lAntler01a.addChild(this.lAntler01b);
        this.lAntler01a.addChild(this.lAntler01e);
        this.lAntler00.addChild(this.lAntler01a);
        this.lAntler02a.addChild(this.lAntler05a);
        this.rAntler04a.addChild(this.rAntler04b);
        this.rAntler03a.addChild(this.rAntler08a);
        this.rAntler07a.addChild(this.rAntler07b);
        this.rAntler01a.addChild(this.rAntler01c);
        this.lAntler06a.addChild(this.lAntler06b);
        this.head.addChild(this.snout);
        this.head.addChild(this.rEar);
        this.head.addChild(this.lEar);
        this.lAntler05a.addChild(this.lAntler05b);
        this.rAntler01a.addChild(this.rAntler02a);
        this.neck.addChild(this.head);
        this.throat.addChild(this.lowerJaw);
        this.lAntler03a.addChild(this.lAntler07a);
        this.lAntler04a.addChild(this.lAntler04b);
        this.rAntler08a.addChild(this.rAntler08b);
        this.lAntler01a.addChild(this.lAntler02a);
        this.lAntler01c.addChild(this.lAntler01d);
        this.head.addChild(this.rAntler00);
        this.rAntler01a.addChild(this.rAntler01e);
        this.lAntler01a.addChild(this.lAntler01c);
        this.lAntler02a.addChild(this.lAntler04a);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.neck.rotateAngleY = (float) Math.toRadians(f);
        this.neck.rotateAngleX = (float) Math.toRadians(f1);
        this.neck.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer ModelRenderer, float x, float y, float z) {
        ModelRenderer.rotateAngleX = x;
        ModelRenderer.rotateAngleY = y;
        ModelRenderer.rotateAngleZ = z;
    }
}
