.class final Lxl;
.super Lxp;
.source "PG"


# instance fields
.field private synthetic a:Lxn;

.field private synthetic b:Lih;

.field private synthetic c:Lxe;


# direct methods
.method constructor <init>(Lxe;Lxn;Lih;)V
    .locals 0

    .prologue
    .line 344
    iput-object p1, p0, Lxl;->c:Lxe;

    iput-object p2, p0, Lxl;->a:Lxn;

    iput-object p3, p0, Lxl;->b:Lih;

    .line 1621
    invoke-direct {p0}, Lxp;-><init>()V

    .line 344
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 348
    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 352
    iget-object v0, p0, Lxl;->b:Lih;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lih;->a(Liu;)Lih;

    .line 353
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Lgt;->c(Landroid/view/View;F)V

    .line 354
    invoke-static {p1, v2}, Lgt;->a(Landroid/view/View;F)V

    .line 355
    invoke-static {p1, v2}, Lgt;->b(Landroid/view/View;F)V

    .line 356
    iget-object v0, p0, Lxl;->c:Lxe;

    iget-object v1, p0, Lxl;->a:Lxn;

    iget-object v1, v1, Lxn;->a:Lzr;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lxe;->a(Lzr;Z)V

    .line 357
    iget-object v0, p0, Lxl;->c:Lxe;

    .line 2034
    iget-object v0, v0, Lxe;->g:Ljava/util/ArrayList;

    .line 357
    iget-object v1, p0, Lxl;->a:Lxn;

    iget-object v1, v1, Lxn;->a:Lzr;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 358
    iget-object v0, p0, Lxl;->c:Lxe;

    .line 3034
    invoke-virtual {v0}, Lxe;->c()V

    .line 359
    return-void
.end method
