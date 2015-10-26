.class final Lbnz;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lbny;


# direct methods
.method constructor <init>(Lbny;Lbmu;)V
    .locals 0

    .prologue
    .line 334
    iput-object p1, p0, Lbnz;->a:Lbny;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 339
    iget-object v2, p0, Lbnz;->a:Lbny;

    iget-object v0, p0, Lbnz;->a:Lbny;

    iget-boolean v0, v0, Lbny;->n:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, v2, Lbny;->n:Z

    .line 340
    iget-object v0, p0, Lbnz;->a:Lbny;

    .line 1320
    iget-object v0, v0, Lbny;->m:Landroid/view/View;

    .line 340
    iget-object v2, p0, Lbnz;->a:Lbny;

    iget-boolean v2, v2, Lbny;->n:Z

    if-eqz v2, :cond_1

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 341
    iget-object v0, p0, Lbnz;->a:Lbny;

    iget-object v0, v0, Lbny;->o:Lbmu;

    .line 2069
    iget-object v0, v0, Lbmu;->h:Landroid/content/Context;

    .line 341
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, La;->dU:I

    .line 342
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 343
    new-instance v1, Lbnx;

    iget-object v2, p0, Lbnz;->a:Lbny;

    iget-object v2, v2, Lbny;->o:Lbmu;

    iget-object v3, p0, Lbnz;->a:Lbny;

    .line 2320
    iget-object v3, v3, Lbny;->l:Landroid/widget/ListView;

    .line 343
    iget-object v4, p0, Lbnz;->a:Lbny;

    iget-object v4, v4, Lbny;->o:Lbmu;

    .line 3069
    iget-object v4, v4, Lbmu;->c:Ljava/util/List;

    .line 344
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    mul-int/2addr v0, v4

    iget-object v4, p0, Lbnz;->a:Lbny;

    iget-boolean v4, v4, Lbny;->n:Z

    invoke-direct {v1, v2, v3, v0, v4}, Lbnx;-><init>(Lbmu;Landroid/view/View;IZ)V

    .line 346
    iget-object v0, p0, Lbnz;->a:Lbny;

    .line 3320
    iget-object v0, v0, Lbny;->l:Landroid/widget/ListView;

    .line 346
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 347
    return-void

    :cond_0
    move v0, v1

    .line 339
    goto :goto_0

    .line 340
    :cond_1
    const/16 v1, 0x8

    goto :goto_1
.end method
