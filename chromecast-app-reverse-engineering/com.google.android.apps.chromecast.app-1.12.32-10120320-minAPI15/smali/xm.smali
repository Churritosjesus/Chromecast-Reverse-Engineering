.class final Lxm;
.super Lxp;
.source "PG"


# instance fields
.field private synthetic a:Lxn;

.field private synthetic b:Lih;

.field private synthetic c:Landroid/view/View;

.field private synthetic d:Lxe;


# direct methods
.method constructor <init>(Lxe;Lxn;Lih;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 366
    iput-object p1, p0, Lxm;->d:Lxe;

    iput-object p2, p0, Lxm;->a:Lxn;

    iput-object p3, p0, Lxm;->b:Lih;

    iput-object p4, p0, Lxm;->c:Landroid/view/View;

    .line 1621
    invoke-direct {p0}, Lxp;-><init>()V

    .line 366
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 370
    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 373
    iget-object v0, p0, Lxm;->b:Lih;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lih;->a(Liu;)Lih;

    .line 374
    iget-object v0, p0, Lxm;->c:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lgt;->c(Landroid/view/View;F)V

    .line 375
    iget-object v0, p0, Lxm;->c:Landroid/view/View;

    invoke-static {v0, v2}, Lgt;->a(Landroid/view/View;F)V

    .line 376
    iget-object v0, p0, Lxm;->c:Landroid/view/View;

    invoke-static {v0, v2}, Lgt;->b(Landroid/view/View;F)V

    .line 377
    iget-object v0, p0, Lxm;->d:Lxe;

    iget-object v1, p0, Lxm;->a:Lxn;

    iget-object v1, v1, Lxn;->b:Lzr;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lxe;->a(Lzr;Z)V

    .line 378
    iget-object v0, p0, Lxm;->d:Lxe;

    .line 2034
    iget-object v0, v0, Lxe;->g:Ljava/util/ArrayList;

    .line 378
    iget-object v1, p0, Lxm;->a:Lxn;

    iget-object v1, v1, Lxn;->b:Lzr;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 379
    iget-object v0, p0, Lxm;->d:Lxe;

    .line 3034
    invoke-virtual {v0}, Lxe;->c()V

    .line 380
    return-void
.end method
