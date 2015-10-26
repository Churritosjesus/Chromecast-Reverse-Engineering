.class final Lati;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laey;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:Z

.field private synthetic c:Landroid/widget/ImageView;

.field private synthetic d:Latf;


# direct methods
.method constructor <init>(Latf;Ljava/lang/String;ZLandroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 212
    iput-object p1, p0, Lati;->d:Latf;

    iput-object p2, p0, Lati;->a:Ljava/lang/String;

    iput-boolean p3, p0, Lati;->b:Z

    iput-object p4, p0, Lati;->c:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 3

    .prologue
    .line 215
    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    iget-object v2, p0, Lati;->a:Ljava/lang/String;

    aput-object v2, v1, v0

    const/4 v2, 0x1

    if-nez p1, :cond_0

    const-string v0, "null"

    :goto_0
    aput-object v0, v1, v2

    .line 216
    return-void

    .line 215
    :cond_0
    invoke-virtual {p1}, Laef;->getMessage()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Laex;Z)V
    .locals 4

    .prologue
    .line 220
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lati;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    .line 1375
    iget-object v0, p1, Laex;->a:Landroid/graphics/Bitmap;

    .line 221
    if-eqz v0, :cond_0

    .line 222
    if-eqz p2, :cond_1

    iget-boolean v0, p0, Lati;->b:Z

    if-nez v0, :cond_1

    .line 223
    iget-object v0, p0, Lati;->c:Landroid/widget/ImageView;

    .line 2375
    iget-object v1, p1, Laex;->a:Landroid/graphics/Bitmap;

    .line 223
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 231
    :cond_0
    :goto_0
    return-void

    .line 226
    :cond_1
    iget-object v0, p0, Lati;->c:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 227
    iget-object v0, p0, Lati;->c:Landroid/widget/ImageView;

    .line 3375
    iget-object v1, p1, Laex;->a:Landroid/graphics/Bitmap;

    .line 227
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 228
    iget-object v0, p0, Lati;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    goto :goto_0
.end method
