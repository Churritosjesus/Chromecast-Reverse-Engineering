.class final Lxh;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Ljava/util/ArrayList;

.field private synthetic b:Lxe;


# direct methods
.method constructor <init>(Lxe;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 163
    iput-object p1, p0, Lxh;->b:Lxe;

    iput-object p2, p0, Lxh;->a:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    .line 165
    iget-object v0, p0, Lxh;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    .line 166
    iget-object v2, p0, Lxh;->b:Lxe;

    .line 10223
    iget-object v3, v0, Lzr;->a:Landroid/view/View;

    .line 10224
    invoke-static {v3}, Lgt;->o(Landroid/view/View;)Lih;

    move-result-object v3

    .line 10225
    iget-object v4, v2, Lxe;->d:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10226
    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v3, v4}, Lih;->a(F)Lih;

    move-result-object v4

    .line 10399
    iget-wide v6, v2, Lzc;->i:J

    .line 10226
    invoke-virtual {v4, v6, v7}, Lih;->a(J)Lih;

    move-result-object v4

    new-instance v5, Lxj;

    invoke-direct {v5, v2, v0, v3}, Lxj;-><init>(Lxe;Lzr;Lih;)V

    invoke-virtual {v4, v5}, Lih;->a(Liu;)Lih;

    move-result-object v0

    invoke-virtual {v0}, Lih;->b()V

    goto :goto_0

    .line 168
    :cond_0
    iget-object v0, p0, Lxh;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 169
    iget-object v0, p0, Lxh;->b:Lxe;

    .line 11034
    iget-object v0, v0, Lxe;->a:Ljava/util/ArrayList;

    .line 169
    iget-object v1, p0, Lxh;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 170
    return-void
.end method
