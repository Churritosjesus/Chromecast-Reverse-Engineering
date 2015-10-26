.class final Lxi;
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
    .line 197
    iput-object p1, p0, Lxi;->c:Lxe;

    iput-object p2, p0, Lxi;->a:Lzr;

    iput-object p3, p0, Lxi;->b:Lih;

    .line 1621
    invoke-direct {p0}, Lxp;-><init>()V

    .line 197
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 201
    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 205
    iget-object v0, p0, Lxi;->b:Lih;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lih;->a(Liu;)Lih;

    .line 206
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Lgt;->c(Landroid/view/View;F)V

    .line 207
    iget-object v0, p0, Lxi;->c:Lxe;

    iget-object v1, p0, Lxi;->a:Lzr;

    invoke-virtual {v0, v1}, Lxe;->d(Lzr;)V

    .line 208
    iget-object v0, p0, Lxi;->c:Lxe;

    .line 2034
    iget-object v0, v0, Lxe;->f:Ljava/util/ArrayList;

    .line 208
    iget-object v1, p0, Lxi;->a:Lzr;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 209
    iget-object v0, p0, Lxi;->c:Lxe;

    .line 3034
    invoke-virtual {v0}, Lxe;->c()V

    .line 210
    return-void
.end method
