.class final Lma;
.super Landroid/view/animation/Animation;
.source "PG"


# instance fields
.field private synthetic a:I

.field private synthetic b:I

.field private synthetic c:Llw;


# direct methods
.method constructor <init>(Llw;II)V
    .locals 0

    .prologue
    .line 434
    iput-object p1, p0, Lma;->c:Llw;

    iput p2, p0, Lma;->a:I

    iput p3, p0, Lma;->b:I

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 4

    .prologue
    .line 437
    iget-object v0, p0, Lma;->c:Llw;

    invoke-static {v0}, Llw;->b(Llw;)Lli;

    move-result-object v0

    iget v1, p0, Lma;->a:I

    int-to-float v1, v1

    iget v2, p0, Lma;->b:I

    iget v3, p0, Lma;->a:I

    sub-int/2addr v2, v3

    int-to-float v2, v2

    mul-float/2addr v2, p1

    add-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Lli;->setAlpha(I)V

    .line 440
    return-void
.end method
