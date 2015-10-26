.class final Lbnv;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lbnu;


# direct methods
.method constructor <init>(Lbnu;Lbmu;)V
    .locals 0

    .prologue
    .line 370
    iput-object p1, p0, Lbnv;->a:Lbnu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 376
    iget-object v2, p0, Lbnv;->a:Lbnu;

    iget-object v0, p0, Lbnv;->a:Lbnu;

    .line 1356
    iget-boolean v0, v0, Lbnu;->n:Z

    .line 376
    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2356
    :goto_0
    iput-boolean v0, v2, Lbnu;->n:Z

    .line 377
    iget-object v0, p0, Lbnv;->a:Lbnu;

    .line 3356
    iget-object v0, v0, Lbnu;->m:Landroid/view/View;

    .line 377
    iget-object v2, p0, Lbnv;->a:Lbnu;

    .line 4356
    iget-boolean v2, v2, Lbnu;->n:Z

    .line 377
    if-eqz v2, :cond_1

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 378
    iget-object v0, p0, Lbnv;->a:Lbnu;

    iget-object v0, v0, Lbnu;->o:Lbmu;

    .line 5069
    iget-object v0, v0, Lbmu;->h:Landroid/content/Context;

    .line 378
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, La;->dC:I

    .line 379
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 380
    new-instance v1, Lbnx;

    iget-object v2, p0, Lbnv;->a:Lbnu;

    iget-object v2, v2, Lbnu;->o:Lbmu;

    iget-object v3, p0, Lbnv;->a:Lbnu;

    .line 5356
    iget-object v3, v3, Lbnu;->l:Landroid/widget/ListView;

    .line 380
    iget-object v4, p0, Lbnv;->a:Lbnu;

    iget-object v4, v4, Lbnu;->o:Lbmu;

    .line 6069
    iget-object v4, v4, Lbmu;->d:Ljava/util/List;

    .line 381
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    mul-int/2addr v0, v4

    iget-object v4, p0, Lbnv;->a:Lbnu;

    .line 6356
    iget-boolean v4, v4, Lbnu;->n:Z

    .line 382
    invoke-direct {v1, v2, v3, v0, v4}, Lbnx;-><init>(Lbmu;Landroid/view/View;IZ)V

    .line 383
    iget-object v0, p0, Lbnv;->a:Lbnu;

    .line 7356
    iget-object v0, v0, Lbnu;->l:Landroid/widget/ListView;

    .line 383
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 384
    return-void

    :cond_0
    move v0, v1

    .line 376
    goto :goto_0

    .line 377
    :cond_1
    const/16 v1, 0x8

    goto :goto_1
.end method
