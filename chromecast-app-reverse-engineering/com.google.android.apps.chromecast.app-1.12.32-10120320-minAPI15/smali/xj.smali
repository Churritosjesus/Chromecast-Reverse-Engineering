.class final Lxj;
.super Lxp;
.source "PG"


# instance fields
.field private synthetic a:Lzr;

.field private synthetic b:Lih;

.field private synthetic c:Lxe;


# direct methods
.method constructor <init>(Lxe;Lzr;Lih;)V
    .locals 0

    .prologue
    .line 227
    iput-object p1, p0, Lxj;->c:Lxe;

    iput-object p2, p0, Lxj;->a:Lzr;

    iput-object p3, p0, Lxj;->b:Lih;

    .line 1621
    invoke-direct {p0}, Lxp;-><init>()V

    .line 227
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 231
    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 239
    iget-object v0, p0, Lxj;->b:Lih;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lih;->a(Liu;)Lih;

    .line 240
    iget-object v0, p0, Lxj;->c:Lxe;

    iget-object v1, p0, Lxj;->a:Lzr;

    invoke-virtual {v0, v1}, Lxe;->f(Lzr;)V

    .line 241
    iget-object v0, p0, Lxj;->c:Lxe;

    .line 2034
    iget-object v0, v0, Lxe;->d:Ljava/util/ArrayList;

    .line 241
    iget-object v1, p0, Lxj;->a:Lzr;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 242
    iget-object v0, p0, Lxj;->c:Lxe;

    .line 3034
    invoke-virtual {v0}, Lxe;->c()V

    .line 243
    return-void
.end method

.method public final c(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 234
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Lgt;->c(Landroid/view/View;F)V

    .line 235
    return-void
.end method
