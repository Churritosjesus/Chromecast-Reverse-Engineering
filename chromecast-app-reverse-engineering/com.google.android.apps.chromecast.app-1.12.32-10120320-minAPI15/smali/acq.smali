.class final Lacq;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laca;


# instance fields
.field final synthetic a:Lacp;

.field private synthetic b:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lacp;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 2913
    iput-object p1, p0, Lacq;->a:Lacp;

    iput-object p2, p0, Lacq;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)V
    .locals 6

    .prologue
    .line 2917
    iget-object v0, p0, Lacq;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lada;

    .line 2918
    invoke-interface {v0}, Lada;->g()Lacx;

    move-result-object v1

    .line 3247
    iget-wide v4, v1, Lacx;->g:J

    .line 2918
    invoke-static {v4, v5}, Lacx;->a(J)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lacq;->a:Lacp;

    iget-object v1, v1, Lacp;->a:Lacb;

    .line 3626
    invoke-virtual {v1}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 2920
    invoke-interface {v1, v0}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v1

    const/4 v3, -0x1

    if-eq v1, v3, :cond_0

    .line 2922
    iget-object v1, p0, Lacq;->a:Lacp;

    iget-object v3, v1, Lacp;->a:Lacb;

    .line 2923
    invoke-interface {v0}, Lada;->g()Lacx;

    move-result-object v1

    .line 4235
    iget-object v1, v1, Lacx;->d:Ljava/lang/String;

    .line 2923
    invoke-static {v1}, Lacb;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2924
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    .line 2923
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lacx;

    .line 2922
    invoke-static {v3, v1}, Lacb;->b(Lacb;Lacx;)Lacx;

    move-result-object v1

    .line 2925
    if-eqz v1, :cond_0

    .line 2926
    iget-object v3, p0, Lacq;->a:Lacp;

    iget-object v3, v3, Lacp;->a:Lacb;

    invoke-static {v3}, Lacb;->e(Lacb;)Landroid/os/Handler;

    move-result-object v3

    new-instance v4, Lacr;

    invoke-direct {v4, p0, v0, v1}, Lacr;-><init>(Lacq;Lada;Lacx;)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 2935
    :cond_1
    return-void
.end method

.method public final a(Ljava/util/Set;)V
    .locals 0

    .prologue
    .line 2940
    return-void
.end method
