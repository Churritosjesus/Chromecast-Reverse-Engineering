.class final Lxg;
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
    .line 140
    iput-object p1, p0, Lxg;->b:Lxe;

    iput-object p2, p0, Lxg;->a:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .prologue
    const/4 v2, 0x0

    const/4 v10, 0x0

    .line 143
    iget-object v0, p0, Lxg;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxn;

    .line 144
    iget-object v5, p0, Lxg;->b:Lxe;

    .line 10334
    iget-object v1, v0, Lxn;->a:Lzr;

    .line 10335
    if-nez v1, :cond_2

    move-object v1, v2

    .line 10336
    :goto_1
    iget-object v3, v0, Lxn;->b:Lzr;

    .line 10337
    if-eqz v3, :cond_3

    iget-object v3, v3, Lzr;->a:Landroid/view/View;

    .line 10338
    :goto_2
    if-eqz v1, :cond_1

    .line 10339
    invoke-static {v1}, Lgt;->o(Landroid/view/View;)Lih;

    move-result-object v1

    .line 10435
    iget-wide v6, v5, Lzc;->l:J

    .line 10339
    invoke-virtual {v1, v6, v7}, Lih;->a(J)Lih;

    move-result-object v1

    .line 10341
    iget-object v6, v5, Lxe;->g:Ljava/util/ArrayList;

    iget-object v7, v0, Lxn;->a:Lzr;

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10342
    iget v6, v0, Lxn;->e:I

    iget v7, v0, Lxn;->c:I

    sub-int/2addr v6, v7

    int-to-float v6, v6

    invoke-virtual {v1, v6}, Lih;->b(F)Lih;

    .line 10343
    iget v6, v0, Lxn;->f:I

    iget v7, v0, Lxn;->d:I

    sub-int/2addr v6, v7

    int-to-float v6, v6

    invoke-virtual {v1, v6}, Lih;->c(F)Lih;

    .line 10344
    invoke-virtual {v1, v10}, Lih;->a(F)Lih;

    move-result-object v6

    new-instance v7, Lxl;

    invoke-direct {v7, v5, v0, v1}, Lxl;-><init>(Lxe;Lxn;Lih;)V

    invoke-virtual {v6, v7}, Lih;->a(Liu;)Lih;

    move-result-object v1

    invoke-virtual {v1}, Lih;->b()V

    .line 10362
    :cond_1
    if-eqz v3, :cond_0

    .line 10363
    invoke-static {v3}, Lgt;->o(Landroid/view/View;)Lih;

    move-result-object v1

    .line 10364
    iget-object v6, v5, Lxe;->g:Ljava/util/ArrayList;

    iget-object v7, v0, Lxn;->b:Lzr;

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10365
    invoke-virtual {v1, v10}, Lih;->b(F)Lih;

    move-result-object v6

    invoke-virtual {v6, v10}, Lih;->c(F)Lih;

    move-result-object v6

    .line 11435
    iget-wide v8, v5, Lzc;->l:J

    .line 10365
    invoke-virtual {v6, v8, v9}, Lih;->a(J)Lih;

    move-result-object v6

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-virtual {v6, v7}, Lih;->a(F)Lih;

    move-result-object v6

    new-instance v7, Lxm;

    invoke-direct {v7, v5, v0, v1, v3}, Lxm;-><init>(Lxe;Lxn;Lih;Landroid/view/View;)V

    invoke-virtual {v6, v7}, Lih;->a(Liu;)Lih;

    move-result-object v0

    invoke-virtual {v0}, Lih;->b()V

    goto :goto_0

    .line 10335
    :cond_2
    iget-object v1, v1, Lzr;->a:Landroid/view/View;

    goto :goto_1

    :cond_3
    move-object v3, v2

    .line 10337
    goto :goto_2

    .line 146
    :cond_4
    iget-object v0, p0, Lxg;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 147
    iget-object v0, p0, Lxg;->b:Lxe;

    .line 12034
    iget-object v0, v0, Lxe;->c:Ljava/util/ArrayList;

    .line 147
    iget-object v1, p0, Lxg;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 148
    return-void
.end method
