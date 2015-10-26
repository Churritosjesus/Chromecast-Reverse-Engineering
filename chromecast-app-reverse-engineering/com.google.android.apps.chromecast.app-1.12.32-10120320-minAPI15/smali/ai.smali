.class final Lai;
.super Landroid/transition/Transition$EpicenterCallback;
.source "PG"


# instance fields
.field private a:Landroid/graphics/Rect;

.field private synthetic b:Lak;


# direct methods
.method constructor <init>(Lak;)V
    .locals 0

    .prologue
    .line 211
    iput-object p1, p0, Lai;->b:Lak;

    invoke-direct {p0}, Landroid/transition/Transition$EpicenterCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGetEpicenter(Landroid/transition/Transition;)Landroid/graphics/Rect;
    .locals 1

    .prologue
    .line 216
    iget-object v0, p0, Lai;->a:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    iget-object v0, p0, Lai;->b:Lak;

    iget-object v0, v0, Lak;->a:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 217
    iget-object v0, p0, Lai;->b:Lak;

    iget-object v0, v0, Lak;->a:Landroid/view/View;

    .line 1035
    invoke-static {v0}, La;->a(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v0

    .line 217
    iput-object v0, p0, Lai;->a:Landroid/graphics/Rect;

    .line 219
    :cond_0
    iget-object v0, p0, Lai;->a:Landroid/graphics/Rect;

    return-object v0
.end method
