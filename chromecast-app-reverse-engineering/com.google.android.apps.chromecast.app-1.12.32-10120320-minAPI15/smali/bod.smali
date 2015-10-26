.class public final Lbod;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lhx;


# instance fields
.field private a:I

.field private synthetic b:Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)V
    .locals 0

    .prologue
    .line 286
    iput-object p1, p0, Lbod;->b:Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .prologue
    .line 321
    iget v0, p0, Lbod;->a:I

    if-nez v0, :cond_0

    .line 322
    iget-object v0, p0, Lbod;->b:Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->a(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)Lboh;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lboh;->a(IF)V

    .line 323
    iget-object v0, p0, Lbod;->b:Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->a(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;II)V

    .line 326
    :cond_0
    iget-object v0, p0, Lbod;->b:Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->b(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)Lhx;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 327
    iget-object v0, p0, Lbod;->b:Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->b(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)Lhx;

    move-result-object v0

    invoke-interface {v0, p1}, Lhx;->a(I)V

    .line 329
    :cond_1
    return-void
.end method

.method public final a(IFI)V
    .locals 2

    .prologue
    .line 291
    iget-object v0, p0, Lbod;->b:Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->a(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)Lboh;

    move-result-object v0

    invoke-virtual {v0}, Lboh;->getChildCount()I

    move-result v0

    .line 292
    if-eqz v0, :cond_0

    if-ltz p1, :cond_0

    if-lt p1, v0, :cond_1

    .line 308
    :cond_0
    :goto_0
    return-void

    .line 296
    :cond_1
    iget-object v0, p0, Lbod;->b:Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->a(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)Lboh;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lboh;->a(IF)V

    .line 298
    iget-object v0, p0, Lbod;->b:Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->a(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)Lboh;

    move-result-object v0

    invoke-virtual {v0, p1}, Lboh;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 299
    if-eqz v0, :cond_2

    .line 300
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p2

    float-to-int v0, v0

    .line 302
    :goto_1
    iget-object v1, p0, Lbod;->b:Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;

    invoke-static {v1, p1, v0}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->a(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;II)V

    .line 304
    iget-object v0, p0, Lbod;->b:Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->b(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)Lhx;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 305
    iget-object v0, p0, Lbod;->b:Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->b(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)Lhx;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lhx;->a(IFI)V

    goto :goto_0

    .line 301
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final b(I)V
    .locals 1

    .prologue
    .line 312
    iput p1, p0, Lbod;->a:I

    .line 314
    iget-object v0, p0, Lbod;->b:Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->b(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)Lhx;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 315
    iget-object v0, p0, Lbod;->b:Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;->b(Lcom/google/android/apps/chromecast/app/widget/SlidingTabLayout;)Lhx;

    move-result-object v0

    invoke-interface {v0, p1}, Lhx;->b(I)V

    .line 317
    :cond_0
    return-void
.end method
