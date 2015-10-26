.class public final Ldhu;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ldhw;


# static fields
.field private static final a:Ljava/util/List;

.field private static final b:Ljava/util/List;


# instance fields
.field private final c:Ldhg;

.field private final d:Ldjb;

.field private e:Ldjn;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 51
    const/4 v0, 0x5

    new-array v0, v0, [Ldke;

    const-string v1, "connection"

    .line 52
    invoke-static {v1}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "host"

    .line 53
    invoke-static {v1}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v1

    aput-object v1, v0, v3

    const-string v1, "keep-alive"

    .line 54
    invoke-static {v1}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "proxy-connection"

    .line 55
    invoke-static {v1}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v1

    aput-object v1, v0, v5

    const-string v1, "transfer-encoding"

    .line 56
    invoke-static {v1}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v1

    aput-object v1, v0, v6

    .line 51
    invoke-static {v0}, Ldgs;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ldhu;->a:Ljava/util/List;

    .line 59
    const/16 v0, 0x8

    new-array v0, v0, [Ldke;

    const-string v1, "connection"

    .line 60
    invoke-static {v1}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "host"

    .line 61
    invoke-static {v1}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v1

    aput-object v1, v0, v3

    const-string v1, "keep-alive"

    .line 62
    invoke-static {v1}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "proxy-connection"

    .line 63
    invoke-static {v1}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v1

    aput-object v1, v0, v5

    const-string v1, "te"

    .line 64
    invoke-static {v1}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v1

    aput-object v1, v0, v6

    const/4 v1, 0x5

    const-string v2, "transfer-encoding"

    .line 65
    invoke-static {v2}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "encoding"

    .line 66
    invoke-static {v2}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "upgrade"

    .line 67
    invoke-static {v2}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v2

    aput-object v2, v0, v1

    .line 59
    invoke-static {v0}, Ldgs;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ldhu;->b:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ldhg;Ldjb;)V
    .locals 0

    .prologue
    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iput-object p1, p0, Ldhu;->c:Ldhg;

    .line 75
    iput-object p2, p0, Ldhu;->d:Ldjb;

    .line 76
    return-void
.end method

.method private static a(Ldfx;Ldke;)Z
    .locals 1

    .prologue
    .line 224
    sget-object v0, Ldfx;->c:Ldfx;

    if-ne p0, v0, :cond_0

    .line 225
    sget-object v0, Ldhu;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    .line 227
    :goto_0
    return v0

    .line 226
    :cond_0
    sget-object v0, Ldfx;->d:Ldfx;

    if-ne p0, v0, :cond_1

    .line 227
    sget-object v0, Ldhu;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 229
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method


# virtual methods
.method public final a(Ldgc;)Ldge;
    .locals 3

    .prologue
    .line 208
    new-instance v0, Ldhn;

    .line 10126
    iget-object v1, p1, Ldgc;->f:Ldfo;

    .line 208
    iget-object v2, p0, Ldhu;->e:Ldjn;

    .line 10195
    iget-object v2, v2, Ldjn;->f:Ldjp;

    .line 208
    invoke-static {v2}, Ldkk;->a(Ldkv;)Ldkd;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ldhn;-><init>(Ldfo;Ldkd;)V

    return-object v0
.end method

.method public final a(Ldfy;J)Ldku;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Ldhu;->e:Ldjn;

    invoke-virtual {v0}, Ldjn;->d()Ldku;

    move-result-object v0

    return-object v0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Ldhu;->e:Ldjn;

    invoke-virtual {v0}, Ldjn;->d()Ldku;

    move-result-object v0

    invoke-interface {v0}, Ldku;->close()V

    .line 101
    return-void
.end method

.method public final a(Ldfy;)V
    .locals 14

    .prologue
    const/4 v2, 0x0

    .line 83
    iget-object v0, p0, Ldhu;->e:Ldjn;

    if-eqz v0, :cond_0

    .line 93
    :goto_0
    return-void

    .line 85
    :cond_0
    iget-object v0, p0, Ldhu;->c:Ldhg;

    invoke-virtual {v0}, Ldhg;->b()V

    .line 86
    iget-object v0, p0, Ldhu;->c:Ldhg;

    invoke-virtual {v0}, Ldhg;->c()Z

    move-result v4

    .line 88
    iget-object v0, p0, Ldhu;->c:Ldhg;

    .line 1408
    iget-object v0, v0, Ldhg;->c:Ldfh;

    .line 2281
    iget-object v0, v0, Ldfh;->g:Ldfx;

    .line 88
    invoke-static {v0}, La;->a(Ldfx;)Ljava/lang/String;

    move-result-object v0

    .line 89
    iget-object v5, p0, Ldhu;->d:Ldjb;

    iget-object v1, p0, Ldhu;->d:Ldjb;

    .line 3179
    iget-object v6, v1, Ldjb;->a:Ldfx;

    .line 5074
    iget-object v7, p1, Ldfy;->c:Ldfo;

    .line 4115
    new-instance v8, Ljava/util/ArrayList;

    .line 5076
    iget-object v1, v7, Ldfo;->a:[Ljava/lang/String;

    array-length v1, v1

    div-int/lit8 v1, v1, 0x2

    .line 4115
    add-int/lit8 v1, v1, 0xa

    invoke-direct {v8, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 4116
    new-instance v1, Ldie;

    sget-object v3, Ldie;->b:Ldke;

    .line 6070
    iget-object v9, p1, Ldfy;->b:Ljava/lang/String;

    .line 4116
    invoke-direct {v1, v3, v9}, Ldie;-><init>(Ldke;Ljava/lang/String;)V

    invoke-interface {v8, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4117
    new-instance v1, Ldie;

    sget-object v3, Ldie;->c:Ldke;

    invoke-virtual {p1}, Ldfy;->a()Ljava/net/URL;

    move-result-object v9

    invoke-static {v9}, La;->a(Ljava/net/URL;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v1, v3, v9}, Ldie;-><init>(Ldke;Ljava/lang/String;)V

    invoke-interface {v8, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4118
    invoke-virtual {p1}, Ldfy;->a()Ljava/net/URL;

    move-result-object v1

    invoke-static {v1}, Ldhg;->a(Ljava/net/URL;)Ljava/lang/String;

    move-result-object v1

    .line 4119
    sget-object v3, Ldfx;->c:Ldfx;

    if-ne v3, v6, :cond_2

    .line 4120
    new-instance v3, Ldie;

    sget-object v9, Ldie;->g:Ldke;

    invoke-direct {v3, v9, v0}, Ldie;-><init>(Ldke;Ljava/lang/String;)V

    invoke-interface {v8, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4121
    new-instance v0, Ldie;

    sget-object v3, Ldie;->f:Ldke;

    invoke-direct {v0, v3, v1}, Ldie;-><init>(Ldke;Ljava/lang/String;)V

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4127
    :goto_1
    new-instance v0, Ldie;

    sget-object v1, Ldie;->d:Ldke;

    invoke-virtual {p1}, Ldfy;->a()Ljava/net/URL;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Ldie;-><init>(Ldke;Ljava/lang/String;)V

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4129
    new-instance v9, Ljava/util/LinkedHashSet;

    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    .line 6076
    iget-object v0, v7, Ldfo;->a:[Ljava/lang/String;

    array-length v0, v0

    div-int/lit8 v10, v0, 0x2

    move v3, v2

    .line 4130
    :goto_2
    if-ge v3, v10, :cond_6

    .line 4132
    invoke-virtual {v7, v3}, Ldfo;->a(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldke;->a(Ljava/lang/String;)Ldke;

    move-result-object v11

    .line 4133
    invoke-virtual {v7, v3}, Ldfo;->b(I)Ljava/lang/String;

    move-result-object v12

    .line 4136
    invoke-static {v6, v11}, Ldhu;->a(Ldfx;Ldke;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4139
    sget-object v0, Ldie;->b:Ldke;

    invoke-virtual {v11, v0}, Ldke;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ldie;->c:Ldke;

    .line 4140
    invoke-virtual {v11, v0}, Ldke;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ldie;->d:Ldke;

    .line 4141
    invoke-virtual {v11, v0}, Ldke;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ldie;->e:Ldke;

    .line 4142
    invoke-virtual {v11, v0}, Ldke;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ldie;->f:Ldke;

    .line 4143
    invoke-virtual {v11, v0}, Ldke;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ldie;->g:Ldke;

    .line 4144
    invoke-virtual {v11, v0}, Ldke;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4149
    invoke-interface {v9, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 4150
    new-instance v0, Ldie;

    invoke-direct {v0, v11, v12}, Ldie;-><init>(Ldke;Ljava/lang/String;)V

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4130
    :cond_1
    :goto_3
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_2

    .line 4122
    :cond_2
    sget-object v0, Ldfx;->d:Ldfx;

    if-ne v0, v6, :cond_3

    .line 4123
    new-instance v0, Ldie;

    sget-object v3, Ldie;->e:Ldke;

    invoke-direct {v0, v3, v1}, Ldie;-><init>(Ldke;Ljava/lang/String;)V

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 4125
    :cond_3
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_4
    move v1, v2

    .line 4155
    :goto_4
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 4156
    invoke-interface {v8, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldie;

    iget-object v0, v0, Ldie;->h:Ldke;

    invoke-virtual {v0, v11}, Ldke;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 4157
    invoke-interface {v8, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldie;

    iget-object v0, v0, Ldie;->i:Ldke;

    invoke-virtual {v0}, Ldke;->a()Ljava/lang/String;

    move-result-object v0

    .line 6167
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 4158
    new-instance v12, Ldie;

    invoke-direct {v12, v11, v0}, Ldie;-><init>(Ldke;Ljava/lang/String;)V

    invoke-interface {v8, v1, v12}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 4155
    :cond_5
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_4

    .line 6245
    :cond_6
    const/4 v0, 0x1

    invoke-virtual {v5, v2, v8, v4, v0}, Ldjb;->a(ILjava/util/List;ZZ)Ldjn;

    move-result-object v0

    .line 89
    iput-object v0, p0, Ldhu;->e:Ldjn;

    .line 92
    iget-object v0, p0, Ldhu;->e:Ldjn;

    .line 7186
    iget-object v0, v0, Ldjn;->h:Ldjq;

    .line 92
    iget-object v1, p0, Ldhu;->c:Ldhg;

    iget-object v1, v1, Ldhg;->b:Ldft;

    .line 7263
    iget v1, v1, Ldft;->w:I

    .line 92
    int-to-long v2, v1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v1}, Ldkw;->a(JLjava/util/concurrent/TimeUnit;)Ldkw;

    goto/16 :goto_0
.end method

.method public final a(Ldhg;)V
    .locals 2

    .prologue
    .line 215
    iget-object v0, p0, Ldhu;->e:Ldjn;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldhu;->e:Ldjn;

    sget-object v1, Ldia;->h:Ldia;

    invoke-virtual {v0, v1}, Ldjn;->a(Ldia;)V

    .line 216
    :cond_0
    return-void
.end method

.method public final a(Ldhp;)V
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Ldhu;->e:Ldjn;

    invoke-virtual {v0}, Ldjn;->d()Ldku;

    move-result-object v0

    invoke-virtual {p1, v0}, Ldhp;->a(Ldku;)V

    .line 97
    return-void
.end method

.method public final b()Ldgd;
    .locals 14

    .prologue
    const/4 v3, 0x0

    .line 104
    iget-object v0, p0, Ldhu;->e:Ldjn;

    invoke-virtual {v0}, Ldjn;->c()Ljava/util/List;

    move-result-object v6

    iget-object v0, p0, Ldhu;->d:Ldjb;

    .line 8179
    iget-object v7, v0, Ldjb;->a:Ldfx;

    .line 9173
    const/4 v2, 0x0

    .line 9174
    const-string v1, "HTTP/1.1"

    .line 9176
    new-instance v8, Ldfp;

    invoke-direct {v8}, Ldfp;-><init>()V

    .line 9177
    sget-object v0, Ldhl;->c:Ljava/lang/String;

    invoke-virtual {v7}, Ldfx;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v0, v4}, Ldfp;->c(Ljava/lang/String;Ljava/lang/String;)Ldfp;

    .line 9178
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    move v5, v3

    :goto_0
    if-ge v5, v9, :cond_5

    .line 9179
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldie;

    iget-object v10, v0, Ldie;->h:Ldke;

    .line 9180
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldie;

    iget-object v0, v0, Ldie;->i:Ldke;

    invoke-virtual {v0}, Ldke;->a()Ljava/lang/String;

    move-result-object v11

    move-object v0, v1

    move v1, v3

    .line 9181
    :goto_1
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v1, v4, :cond_4

    .line 9182
    invoke-virtual {v11, v3, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    .line 9183
    const/4 v12, -0x1

    if-ne v4, v12, :cond_0

    .line 9184
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v4

    .line 9186
    :cond_0
    invoke-virtual {v11, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 9187
    sget-object v12, Ldie;->a:Ldke;

    invoke-virtual {v10, v12}, Ldke;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    .line 9194
    :goto_2
    add-int/lit8 v2, v4, 0x1

    move v13, v2

    move-object v2, v1

    move v1, v13

    .line 9195
    goto :goto_1

    .line 9189
    :cond_1
    sget-object v12, Ldie;->g:Ldke;

    invoke-virtual {v10, v12}, Ldke;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2

    move-object v0, v1

    move-object v1, v2

    .line 9190
    goto :goto_2

    .line 9191
    :cond_2
    invoke-static {v7, v10}, Ldhu;->a(Ldfx;Ldke;)Z

    move-result v12

    if-nez v12, :cond_3

    .line 9192
    invoke-virtual {v10}, Ldke;->a()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12, v1}, Ldfp;->a(Ljava/lang/String;Ljava/lang/String;)Ldfp;

    :cond_3
    move-object v1, v2

    goto :goto_2

    .line 9178
    :cond_4
    add-int/lit8 v1, v5, 0x1

    move v5, v1

    move-object v1, v0

    goto :goto_0

    .line 9197
    :cond_5
    if-nez v2, :cond_6

    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Expected \':status\' header not present"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9199
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldhv;->a(Ljava/lang/String;)Ldhv;

    move-result-object v0

    .line 9200
    new-instance v1, Ldgd;

    invoke-direct {v1}, Ldgd;-><init>()V

    .line 9256
    iput-object v7, v1, Ldgd;->b:Ldfx;

    .line 9201
    iget v2, v0, Ldhv;->b:I

    .line 9261
    iput v2, v1, Ldgd;->c:I

    .line 9202
    iget-object v0, v0, Ldhv;->c:Ljava/lang/String;

    .line 9266
    iput-object v0, v1, Ldgd;->d:Ljava/lang/String;

    .line 9204
    invoke-virtual {v8}, Ldfp;->a()Ldfo;

    move-result-object v0

    invoke-virtual {v1, v0}, Ldgd;->a(Ldfo;)Ldgd;

    move-result-object v0

    .line 104
    return-object v0
.end method

.method public final c()V
    .locals 0

    .prologue
    .line 212
    return-void
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 219
    const/4 v0, 0x1

    return v0
.end method
