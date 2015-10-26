.class final Lxk;
.super Lxp;
.source "PG"


# instance fields
.field private synthetic a:Lzr;

.field private synthetic b:I

.field private synthetic c:I

.field private synthetic d:Lih;

.field private synthetic e:Lxe;


# direct methods
.method constructor <init>(Lxe;Lzr;IILih;)V
    .locals 0

    .prologue
    .line 285
    iput-object p1, p0, Lxk;->e:Lxe;

    iput-object p2, p0, Lxk;->a:Lzr;

    iput p3, p0, Lxk;->b:I

    iput p4, p0, Lxk;->c:I

    iput-object p5, p0, Lxk;->d:Lih;

    .line 1621
    invoke-direct {p0}, Lxp;-><init>()V

    .line 285
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 289
    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 301
    iget-object v0, p0, Lxk;->d:Lih;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lih;->a(Liu;)Lih;

    .line 302
    iget-object v0, p0, Lxk;->e:Lxe;

    iget-object v1, p0, Lxk;->a:Lzr;

    invoke-virtual {v0, v1}, Lxe;->e(Lzr;)V

    .line 303
    iget-object v0, p0, Lxk;->e:Lxe;

    .line 2034
    iget-object v0, v0, Lxe;->e:Ljava/util/ArrayList;

    .line 303
    iget-object v1, p0, Lxk;->a:Lzr;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 304
    iget-object v0, p0, Lxk;->e:Lxe;

    .line 3034
    invoke-virtual {v0}, Lxe;->c()V

    .line 305
    return-void
.end method

.method public final c(Landroid/view/View;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 292
    iget v0, p0, Lxk;->b:I

    if-eqz v0, :cond_0

    .line 293
    invoke-static {p1, v1}, Lgt;->a(Landroid/view/View;F)V

    .line 295
    :cond_0
    iget v0, p0, Lxk;->c:I

    if-eqz v0, :cond_1

    .line 296
    invoke-static {p1, v1}, Lgt;->b(Landroid/view/View;F)V

    .line 298
    :cond_1
    return-void
.end method
