.class final Latx;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laea;


# instance fields
.field private synthetic a:Lauo;

.field private synthetic b:Latw;


# direct methods
.method constructor <init>(Latw;Lauo;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Latx;->b:Latw;

    iput-object p2, p0, Latx;->a:Lauo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 10

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 68
    check-cast p1, Ldbs;

    .line 1072
    if-eqz p1, :cond_10

    iget-object v0, p1, Ldbs;->a:[Ldbr;

    if-eqz v0, :cond_10

    .line 1073
    iget-object v0, p0, Latx;->b:Latw;

    .line 2053
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iput-wide v4, v0, Laun;->g:J

    .line 1075
    iget-object v4, p0, Latx;->b:Latw;

    iget-object v5, p1, Ldbs;->a:[Ldbr;

    .line 2159
    if-nez v5, :cond_3

    move v0, v2

    .line 1076
    :goto_0
    if-nez v0, :cond_0

    .line 1077
    iget-object v1, p0, Latx;->b:Latw;

    invoke-virtual {v1, p1}, Latw;->a(Ldbs;)V

    .line 1081
    :cond_0
    iget-object v1, p0, Latx;->b:Latw;

    invoke-static {v1}, Latw;->a(Latw;)Z

    move-result v1

    if-eqz v1, :cond_1

    if-nez v0, :cond_f

    .line 1082
    :cond_1
    iget-object v0, p0, Latx;->b:Latw;

    invoke-static {v0, v3}, Latw;->a(Latw;Z)Z

    .line 1083
    iget-object v0, p0, Latx;->b:Latw;

    iget-object v0, v0, Latw;->h:Lblp;

    new-array v0, v3, [Ljava/lang/Object;

    iget-object v1, p0, Latx;->b:Latw;

    .line 1084
    invoke-static {v1}, Latw;->b(Latw;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    .line 1085
    iget-object v0, p0, Latx;->a:Lauo;

    if-eqz v0, :cond_10

    .line 1086
    iget-object v0, p0, Latx;->a:Lauo;

    invoke-interface {v0, v3}, Lauo;->a(Z)V

    .line 1087
    :cond_2
    :goto_1
    return-void

    .line 2162
    :cond_3
    iget-object v0, v4, Latw;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    array-length v1, v5

    if-eq v0, v1, :cond_4

    move v0, v2

    .line 2163
    goto :goto_0

    :cond_4
    move v1, v2

    .line 2165
    :goto_2
    iget-object v0, v4, Latw;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_e

    .line 2166
    iget-object v0, v4, Latw;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Last;

    aget-object v6, v5, v1

    .line 3058
    iget-object v7, v0, Last;->a:Ljava/lang/String;

    .line 2174
    iget-object v8, v6, Ldbr;->a:Ljava/lang/String;

    invoke-static {v7, v8}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_5

    move v0, v2

    .line 2166
    :goto_3
    if-nez v0, :cond_d

    move v0, v2

    .line 2167
    goto :goto_0

    .line 3067
    :cond_5
    iget-object v7, v0, Last;->b:Ljava/lang/String;

    .line 2177
    iget-object v8, v6, Ldbr;->b:Ljava/lang/String;

    invoke-static {v7, v8}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_6

    move v0, v2

    .line 2178
    goto :goto_3

    .line 3074
    :cond_6
    iget-object v7, v0, Last;->c:Ljava/lang/String;

    .line 2180
    iget-object v8, v6, Ldbr;->c:Ljava/lang/String;

    invoke-static {v7, v8}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_7

    move v0, v2

    .line 2181
    goto :goto_3

    .line 4054
    :cond_7
    iget-wide v8, v0, Last;->d:J

    .line 2183
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v6, v6, Ldbr;->d:Ljava/lang/Long;

    .line 4164
    if-nez v0, :cond_8

    if-nez v6, :cond_8

    move v0, v3

    .line 2183
    :goto_4
    if-nez v0, :cond_c

    move v0, v2

    .line 2184
    goto :goto_3

    .line 4167
    :cond_8
    if-eqz v0, :cond_9

    if-nez v6, :cond_a

    :cond_9
    move v0, v2

    .line 4168
    goto :goto_4

    .line 4170
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long v0, v8, v6

    if-nez v0, :cond_b

    move v0, v3

    goto :goto_4

    :cond_b
    move v0, v2

    goto :goto_4

    :cond_c
    move v0, v3

    .line 2186
    goto :goto_3

    .line 2165
    :cond_d
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :cond_e
    move v0, v3

    .line 2170
    goto/16 :goto_0

    .line 1090
    :cond_f
    iget-object v0, p0, Latx;->b:Latw;

    iget-object v0, v0, Latw;->h:Lblp;

    .line 1093
    :cond_10
    iget-object v0, p0, Latx;->a:Lauo;

    if-eqz v0, :cond_2

    .line 1094
    iget-object v0, p0, Latx;->a:Lauo;

    invoke-interface {v0, v2}, Lauo;->a(Z)V

    goto/16 :goto_1
.end method
