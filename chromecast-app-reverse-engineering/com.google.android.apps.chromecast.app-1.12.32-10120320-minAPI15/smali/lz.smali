.class final Llz;
.super Landroid/view/animation/Animation;
.source "PG"


# instance fields
.field private synthetic a:Llw;


# direct methods
.method constructor <init>(Llw;)V
    .locals 0

    .prologue
    .line 408
    iput-object p1, p0, Llz;->a:Llw;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    .prologue
    .line 411
    iget-object v0, p0, Llz;->a:Llw;

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, p1

    invoke-static {v0, v1}, Llw;->a(Llw;F)V

    .line 412
    return-void
.end method
