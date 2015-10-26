.class final Lagc;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Ljava/util/ArrayList;

.field private synthetic b:Lagm;


# direct methods
.method constructor <init>(Ljava/util/ArrayList;Lagm;)V
    .locals 0

    .prologue
    .line 1357
    iput-object p1, p0, Lagc;->a:Ljava/util/ArrayList;

    iput-object p2, p0, Lagc;->b:Lagm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 1359
    iget-object v0, p0, Lagc;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    .line 1360
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Lagf;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Lagp;

    invoke-interface {v1, v0}, Lagf;->a(Lagp;)V

    goto :goto_0

    .line 1363
    :cond_0
    iget-object v0, p0, Lagc;->b:Lagm;

    .line 2168
    iget-object v0, v0, Lagm;->d:Ljava/util/List;

    .line 1364
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lagn;

    .line 1365
    invoke-interface {v0}, Lagn;->a()V

    goto :goto_1

    .line 1367
    :cond_1
    return-void
.end method
