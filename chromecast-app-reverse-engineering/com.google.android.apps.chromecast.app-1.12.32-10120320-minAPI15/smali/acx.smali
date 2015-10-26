.class public final Lacx;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:I

.field b:Z

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field final e:I

.field final f:Ljava/lang/String;

.field public final g:J

.field public final h:Ljava/lang/Long;

.field public final i:J

.field final j:Landroid/net/Uri;

.field k:Z

.field public final l:Ljava/lang/String;

.field private m:[B

.field private n:I

.field private o:Ljava/lang/String;

.field private final p:[Ljava/lang/String;


# direct methods
.method private constructor <init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/Long;JLandroid/net/Uri;ZZLjava/lang/String;[Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    iput p1, p0, Lacx;->a:I

    .line 101
    iput-boolean p12, p0, Lacx;->b:Z

    .line 102
    iput-object p2, p0, Lacx;->c:Ljava/lang/String;

    .line 103
    iput-object p3, p0, Lacx;->d:Ljava/lang/String;

    .line 104
    iput p4, p0, Lacx;->e:I

    .line 105
    iput-object p5, p0, Lacx;->f:Ljava/lang/String;

    .line 106
    iput-wide p6, p0, Lacx;->g:J

    .line 107
    iput-object p8, p0, Lacx;->h:Ljava/lang/Long;

    .line 108
    iput-wide p9, p0, Lacx;->i:J

    .line 109
    iput-object p11, p0, Lacx;->j:Landroid/net/Uri;

    .line 110
    const/4 v1, 0x0

    iput-object v1, p0, Lacx;->m:[B

    .line 111
    iput-boolean p13, p0, Lacx;->k:Z

    .line 112
    move-object/from16 v0, p14

    iput-object v0, p0, Lacx;->l:Ljava/lang/String;

    .line 113
    const/4 v1, 0x0

    iput v1, p0, Lacx;->n:I

    .line 114
    const/4 v1, 0x0

    iput-object v1, p0, Lacx;->o:Ljava/lang/String;

    .line 115
    move-object/from16 v0, p15

    iput-object v0, p0, Lacx;->p:[Ljava/lang/String;

    .line 116
    return-void
.end method

.method public static a(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JLjava/lang/Long;JLjava/lang/String;ZLjava/lang/String;)Lacx;
    .locals 19

    .prologue
    .line 180
    new-instance v3, Lacx;

    const/4 v4, 0x0

    move/from16 v0, p1

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-static {v0, v1, v2}, Lacx;->a(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz p10, :cond_0

    .line 183
    invoke-static/range {p10 .. p10}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v14

    :goto_0
    const/4 v15, 0x1

    const/16 v16, 0x1

    const/16 v18, 0x0

    move-object/from16 v6, p2

    move/from16 v7, p3

    move-object/from16 v8, p4

    move-wide/from16 v9, p5

    move-object/from16 v11, p7

    move-wide/from16 v12, p8

    move-object/from16 v17, p12

    invoke-direct/range {v3 .. v18}, Lacx;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/Long;JLandroid/net/Uri;ZZLjava/lang/String;[Ljava/lang/String;)V

    return-object v3

    :cond_0
    const/4 v14, 0x0

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Z)Lacx;
    .locals 16

    .prologue
    .line 161
    new-instance v0, Lacx;

    const/4 v1, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x0

    const-wide/16 v6, -0x2

    const/4 v8, 0x0

    const-wide/16 v9, -0x2

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v13, p2

    invoke-direct/range {v0 .. v15}, Lacx;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/Long;JLandroid/net/Uri;ZZLjava/lang/String;[Ljava/lang/String;)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;Z)Lacx;
    .locals 16

    .prologue
    .line 136
    invoke-static/range {p0 .. p0}, Landroid/text/util/Rfc822Tokenizer;->tokenize(Ljava/lang/CharSequence;)[Landroid/text/util/Rfc822Token;

    move-result-object v0

    .line 137
    array-length v1, v0

    if-lez v1, :cond_0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/text/util/Rfc822Token;->getAddress()Ljava/lang/String;

    move-result-object v2

    .line 139
    :goto_0
    new-instance v0, Lacx;

    const/4 v1, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x0

    const-wide/16 v6, -0x1

    const/4 v8, 0x0

    const-wide/16 v9, -0x1

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v3, v2

    move/from16 v13, p1

    invoke-direct/range {v0 .. v15}, Lacx;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/Long;JLandroid/net/Uri;ZZLjava/lang/String;[Ljava/lang/String;)V

    return-object v0

    :cond_0
    move-object/from16 v2, p0

    .line 137
    goto :goto_0
.end method

.method private static a(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 223
    const/16 v0, 0x14

    if-le p0, v0, :cond_0

    :goto_0
    return-object p1

    :cond_0
    move-object p1, p2

    goto :goto_0
.end method

.method public static a(J)Z
    .locals 2

    .prologue
    .line 127
    const-wide/16 v0, -0x1

    cmp-long v0, p0, v0

    if-eqz v0, :cond_0

    const-wide/16 v0, -0x2

    cmp-long v0, p0, v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;JLjava/lang/Long;JLjava/lang/String;ZLjava/lang/String;)Lacx;
    .locals 19

    .prologue
    .line 191
    new-instance v3, Lacx;

    const/4 v4, 0x0

    move/from16 v0, p1

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-static {v0, v1, v2}, Lacx;->a(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz p10, :cond_0

    .line 194
    invoke-static/range {p10 .. p10}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v14

    :goto_0
    const/4 v15, 0x0

    const/16 v16, 0x1

    const/16 v18, 0x0

    move-object/from16 v6, p2

    move/from16 v7, p3

    move-object/from16 v8, p4

    move-wide/from16 v9, p5

    move-object/from16 v11, p7

    move-wide/from16 v12, p8

    move-object/from16 v17, p12

    invoke-direct/range {v3 .. v18}, Lacx;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/Long;JLandroid/net/Uri;ZZLjava/lang/String;[Ljava/lang/String;)V

    return-object v3

    :cond_0
    const/4 v14, 0x0

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;Z)Lacx;
    .locals 16

    .prologue
    .line 149
    new-instance v0, Lacx;

    const/4 v1, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x0

    const-wide/16 v6, -0x1

    const/4 v8, 0x0

    const-wide/16 v9, -0x1

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v2, p0

    move-object/from16 v3, p0

    invoke-direct/range {v0 .. v15}, Lacx;-><init>(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/Long;JLandroid/net/Uri;ZZLjava/lang/String;[Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final declared-synchronized a([B)V
    .locals 1

    .prologue
    .line 268
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lacx;->m:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 269
    monitor-exit p0

    return-void

    .line 268
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a()[B
    .locals 1

    .prologue
    .line 273
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lacx;->m:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .prologue
    .line 294
    iget-object v0, p0, Lacx;->c:Ljava/lang/String;

    iget-object v1, p0, Lacx;->d:Ljava/lang/String;

    iget-boolean v2, p0, Lacx;->k:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x12

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " <"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ">, isValid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
