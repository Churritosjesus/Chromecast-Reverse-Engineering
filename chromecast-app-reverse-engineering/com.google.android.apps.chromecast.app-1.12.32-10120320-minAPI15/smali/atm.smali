.class final Latm;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laea;


# instance fields
.field private synthetic a:Laow;

.field private synthetic b:Latf;


# direct methods
.method constructor <init>(Latf;Laow;)V
    .locals 0

    .prologue
    .line 356
    iput-object p1, p0, Latm;->b:Latf;

    iput-object p2, p0, Latm;->a:Laow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 7

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 356
    check-cast p1, Ldcu;

    .line 3359
    new-array v0, v1, [Ljava/lang/Object;

    iget-object v3, p0, Latm;->a:Laow;

    invoke-virtual {v3}, Laow;->g()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v2

    .line 3360
    invoke-static {}, Laqi;->a()Laqi;

    .line 3362
    iget-object v4, p0, Latm;->a:Laow;

    .line 4313
    invoke-virtual {v4}, Laow;->o()Latu;

    move-result-object v5

    .line 5220
    iget-object v0, p1, Ldcu;->b:Ljava/lang/String;

    .line 5067
    iget-object v3, v5, Latu;->h:Ljava/lang/String;

    invoke-static {v3, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 6220
    iget-object v0, p1, Ldcu;->b:Ljava/lang/String;

    .line 5068
    iput-object v0, v5, Latu;->h:Ljava/lang/String;

    .line 6271
    iget-object v0, p1, Ldcu;->c:Ljava/lang/String;

    .line 5069
    iput-object v0, v5, Latu;->i:Ljava/lang/String;

    move v0, v1

    .line 7169
    :goto_0
    iget-object v3, p1, Ldcu;->a:Ljava/lang/String;

    .line 5075
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 7677
    iget-object v3, p1, Ldcu;->g:Ljava/lang/String;

    .line 5078
    :cond_0
    iget-object v6, v5, Latu;->f:Ljava/lang/String;

    invoke-static {v6, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_5

    .line 5079
    iput-object v3, v5, Latu;->f:Ljava/lang/String;

    move v3, v1

    .line 8329
    :goto_1
    iget-object v0, p1, Ldcu;->d:Lddw;

    invoke-interface {v0}, Lddw;->size()I

    move-result v0

    .line 5084
    new-array v6, v0, [Ljava/lang/String;

    .line 5085
    :goto_2
    array-length v0, v6

    if-ge v2, v0, :cond_1

    .line 8335
    iget-object v0, p1, Ldcu;->d:Lddw;

    invoke-interface {v0, v2}, Lddw;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldcq;

    .line 8580
    iget-object v0, v0, Ldcq;->a:Ljava/lang/String;

    .line 5086
    aput-object v0, v6, v2

    .line 5085
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 5088
    :cond_1
    const-string v0, "\n"

    invoke-static {v0, v6}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 5089
    iget-object v2, v5, Latu;->g:Ljava/lang/String;

    invoke-static {v2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 5090
    iput-object v0, v5, Latu;->g:Ljava/lang/String;

    move v3, v1

    .line 9441
    :cond_2
    iget-object v0, p1, Ldcu;->e:Ljava/lang/String;

    .line 5094
    iput-object v0, v5, Latu;->c:Ljava/lang/String;

    .line 5095
    invoke-virtual {p1}, Ldcu;->b()Ldbw;

    move-result-object v0

    iput-object v0, v5, Latu;->e:Ldbw;

    .line 9519
    iget-object v0, p1, Ldcu;->f:Lddw;

    .line 5096
    iput-object v0, v5, Latu;->b:Ljava/util/List;

    .line 5099
    iget-object v0, v5, Latu;->d:Latv;

    if-eqz v0, :cond_4

    .line 5101
    const/4 v0, 0x0

    iput-object v0, v5, Latu;->d:Latv;

    .line 4313
    :goto_3
    if-eqz v1, :cond_3

    .line 4315
    invoke-virtual {v4}, Laow;->p()V

    .line 356
    :cond_3
    return-void

    :cond_4
    move v1, v3

    goto :goto_3

    :cond_5
    move v3, v0

    goto :goto_1

    :cond_6
    move v0, v2

    goto :goto_0
.end method
