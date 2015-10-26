.class public final Ldcu;
.super Lddq;
.source "PG"

# interfaces
.implements Ldec;


# static fields
.field private static volatile m:Lded;

.field private static final n:Ldcu;

.field private static volatile o:Ldee;

.field private static final serialVersionUID:J


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Lddw;

.field public e:Ljava/lang/String;

.field public f:Lddw;

.field public g:Ljava/lang/String;

.field private j:I

.field private k:I

.field private l:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 1796
    const/4 v0, 0x0

    sput-object v0, Ldcu;->m:Lded;

    .line 2463
    new-instance v0, Ldcu;

    sget-object v1, Lddv;->c:Lddn;

    .line 2467
    invoke-static {}, Lddp;->a()Lddp;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ldcu;-><init>(Lddn;Lddp;)V

    sput-object v0, Ldcu;->n:Ldcu;

    .line 2468
    return-void
.end method

.method private constructor <init>(Lddn;Lddp;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 1043
    invoke-direct {p0}, Lddq;-><init>()V

    .line 1044
    const-string v0, ""

    iput-object v0, p0, Ldcu;->a:Ljava/lang/String;

    .line 1045
    const-string v0, ""

    iput-object v0, p0, Ldcu;->b:Ljava/lang/String;

    .line 1046
    const-string v0, ""

    iput-object v0, p0, Ldcu;->c:Ljava/lang/String;

    .line 3249
    invoke-static {}, Ldef;->d()Ldef;

    move-result-object v0

    .line 1047
    iput-object v0, p0, Ldcu;->d:Lddw;

    .line 1048
    const-string v0, ""

    iput-object v0, p0, Ldcu;->e:Ljava/lang/String;

    .line 1049
    iput v1, p0, Ldcu;->k:I

    .line 4249
    invoke-static {}, Ldef;->d()Ldef;

    move-result-object v0

    .line 1050
    iput-object v0, p0, Ldcu;->f:Lddw;

    .line 1051
    iput v1, p0, Ldcu;->l:I

    .line 1052
    const-string v0, ""

    iput-object v0, p0, Ldcu;->g:Ljava/lang/String;

    .line 1054
    invoke-static {}, Ldek;->b()Ldel;

    move-result-object v2

    .line 1056
    const/4 v0, 0x0

    .line 1057
    :cond_0
    :goto_0
    if-nez v0, :cond_7

    .line 1058
    :try_start_0
    invoke-virtual {p1}, Lddn;->a()I

    move-result v3

    .line 1059
    sparse-switch v3, :sswitch_data_0

    .line 5069
    invoke-virtual {v2, v3, p1}, Ldel;->a(ILddn;)Z

    move-result v3

    .line 1064
    if-nez v3, :cond_0

    move v0, v1

    .line 1066
    goto :goto_0

    :sswitch_0
    move v0, v1

    .line 1062
    goto :goto_0

    .line 1071
    :sswitch_1
    invoke-virtual {p1}, Lddn;->c()Ljava/lang/String;

    move-result-object v3

    .line 1072
    iget v4, p0, Ldcu;->j:I

    or-int/lit8 v4, v4, 0x1

    iput v4, p0, Ldcu;->j:I

    .line 1073
    iput-object v3, p0, Ldcu;->a:Ljava/lang/String;
    :try_end_0
    .catch Lddx; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1140
    :catch_0
    move-exception v0

    .line 1141
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 8029
    iput-object p0, v0, Lddx;->a:Ldea;

    .line 1141
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1147
    :catchall_0
    move-exception v0

    iget-object v1, p0, Ldcu;->d:Lddw;

    invoke-interface {v1}, Lddw;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1148
    iget-object v1, p0, Ldcu;->d:Lddw;

    invoke-interface {v1}, Lddw;->b()V

    .line 1150
    :cond_1
    iget-object v1, p0, Ldcu;->f:Lddw;

    invoke-interface {v1}, Lddw;->a()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1151
    iget-object v1, p0, Ldcu;->f:Lddw;

    invoke-interface {v1}, Lddw;->b()V

    .line 1153
    :cond_2
    invoke-virtual {v2}, Ldel;->a()Ldek;

    move-result-object v1

    iput-object v1, p0, Ldcu;->h:Ldek;

    throw v0

    .line 1077
    :sswitch_2
    :try_start_2
    invoke-virtual {p1}, Lddn;->c()Ljava/lang/String;

    move-result-object v3

    .line 1078
    iget v4, p0, Ldcu;->j:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Ldcu;->j:I

    .line 1079
    iput-object v3, p0, Ldcu;->b:Ljava/lang/String;
    :try_end_2
    .catch Lddx; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 1142
    :catch_1
    move-exception v0

    .line 1143
    :try_start_3
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Lddx;

    .line 1145
    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lddx;-><init>(Ljava/lang/String;)V

    .line 9029
    iput-object p0, v3, Lddx;->a:Ldea;

    .line 1145
    invoke-direct {v1, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1083
    :sswitch_3
    :try_start_4
    iget-object v3, p0, Ldcu;->d:Lddw;

    invoke-interface {v3}, Lddw;->a()Z

    move-result v3

    if-nez v3, :cond_3

    .line 5241
    new-instance v3, Ldef;

    invoke-direct {v3}, Ldef;-><init>()V

    .line 1084
    iput-object v3, p0, Ldcu;->d:Lddw;

    .line 1086
    :cond_3
    iget-object v3, p0, Ldcu;->d:Lddw;

    .line 1087
    invoke-static {}, Ldcq;->b()Ldcq;

    move-result-object v4

    .line 1086
    invoke-virtual {p1, v4, p2}, Lddn;->a(Lddq;Lddp;)Lddq;

    move-result-object v4

    invoke-interface {v3, v4}, Lddw;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 1091
    :sswitch_4
    invoke-virtual {p1}, Lddn;->c()Ljava/lang/String;

    move-result-object v3

    .line 1092
    iget v4, p0, Ldcu;->j:I

    or-int/lit8 v4, v4, 0x8

    iput v4, p0, Ldcu;->j:I

    .line 1093
    iput-object v3, p0, Ldcu;->e:Ljava/lang/String;

    goto/16 :goto_0

    .line 1097
    :sswitch_5
    iget-object v3, p0, Ldcu;->f:Lddw;

    invoke-interface {v3}, Lddw;->a()Z

    move-result v3

    if-nez v3, :cond_4

    .line 6241
    new-instance v3, Ldef;

    invoke-direct {v3}, Ldef;-><init>()V

    .line 1098
    iput-object v3, p0, Ldcu;->f:Lddw;

    .line 1100
    :cond_4
    iget-object v3, p0, Ldcu;->f:Lddw;

    .line 1101
    invoke-static {}, Ldcw;->c()Ldcw;

    move-result-object v4

    .line 1100
    invoke-virtual {p1, v4, p2}, Lddn;->a(Lddq;Lddp;)Lddq;

    move-result-object v4

    invoke-interface {v3, v4}, Lddw;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 6636
    :sswitch_6
    invoke-virtual {p1}, Lddn;->d()I

    move-result v3

    .line 1106
    invoke-static {v3}, Ldbw;->a(I)Ldbw;

    move-result-object v4

    .line 1107
    if-nez v4, :cond_5

    .line 1108
    const/4 v4, 0x6

    invoke-virtual {v2, v4, v3}, Ldel;->a(II)Ldel;

    goto/16 :goto_0

    .line 1110
    :cond_5
    iget v4, p0, Ldcu;->j:I

    or-int/lit8 v4, v4, 0x20

    iput v4, p0, Ldcu;->j:I

    .line 1111
    iput v3, p0, Ldcu;->l:I

    goto/16 :goto_0

    .line 1116
    :sswitch_7
    invoke-virtual {p1}, Lddn;->c()Ljava/lang/String;

    move-result-object v3

    .line 1117
    iget v4, p0, Ldcu;->j:I

    or-int/lit8 v4, v4, 0x40

    iput v4, p0, Ldcu;->j:I

    .line 1118
    iput-object v3, p0, Ldcu;->g:Ljava/lang/String;

    goto/16 :goto_0

    .line 1122
    :sswitch_8
    invoke-virtual {p1}, Lddn;->c()Ljava/lang/String;

    move-result-object v3

    .line 1123
    iget v4, p0, Ldcu;->j:I

    or-int/lit8 v4, v4, 0x4

    iput v4, p0, Ldcu;->j:I

    .line 1124
    iput-object v3, p0, Ldcu;->c:Ljava/lang/String;

    goto/16 :goto_0

    .line 7636
    :sswitch_9
    invoke-virtual {p1}, Lddn;->d()I

    move-result v3

    .line 1129
    invoke-static {v3}, Ldco;->a(I)Ldco;

    move-result-object v4

    .line 1130
    if-nez v4, :cond_6

    .line 1131
    const/16 v4, 0x9

    invoke-virtual {v2, v4, v3}, Ldel;->a(II)Ldel;

    goto/16 :goto_0

    .line 1133
    :cond_6
    iget v4, p0, Ldcu;->j:I

    or-int/lit8 v4, v4, 0x10

    iput v4, p0, Ldcu;->j:I

    .line 1134
    iput v3, p0, Ldcu;->k:I
    :try_end_4
    .catch Lddx; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_0

    .line 1147
    :cond_7
    iget-object v0, p0, Ldcu;->d:Lddw;

    invoke-interface {v0}, Lddw;->a()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1148
    iget-object v0, p0, Ldcu;->d:Lddw;

    invoke-interface {v0}, Lddw;->b()V

    .line 1150
    :cond_8
    iget-object v0, p0, Ldcu;->f:Lddw;

    invoke-interface {v0}, Lddw;->a()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1151
    iget-object v0, p0, Ldcu;->f:Lddw;

    invoke-interface {v0}, Lddw;->b()V

    .line 1153
    :cond_9
    invoke-virtual {v2}, Ldel;->a()Ldek;

    move-result-object v0

    iput-object v0, p0, Ldcu;->h:Ldek;

    .line 1154
    return-void

    .line 1059
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x22 -> :sswitch_4
        0x2a -> :sswitch_5
        0x30 -> :sswitch_6
        0x3a -> :sswitch_7
        0x42 -> :sswitch_8
        0x48 -> :sswitch_9
    .end sparse-switch
.end method

.method public static a([B)Ldcu;
    .locals 1

    .prologue
    .line 12477
    sget-object v0, Ldcu;->n:Ldcu;

    invoke-virtual {v0}, Ldcu;->f()Ldee;

    move-result-object v0

    .line 1818
    invoke-interface {v0, p0}, Ldee;->a([B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldcu;

    return-object v0
.end method

.method static synthetic c()Ldcu;
    .locals 1

    .prologue
    .line 1036
    sget-object v0, Ldcu;->n:Ldcu;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 7

    .prologue
    const/16 v6, 0x8

    const/4 v5, 0x4

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 1749
    iget v0, p0, Ldcu;->i:I

    .line 1750
    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    .line 1791
    :goto_0
    return v0

    .line 1753
    :cond_0
    iget v0, p0, Ldcu;->j:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v3, :cond_9

    .line 11169
    iget-object v0, p0, Ldcu;->a:Ljava/lang/String;

    .line 1755
    invoke-static {v3, v0}, Lddo;->b(ILjava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 1757
    :goto_1
    iget v2, p0, Ldcu;->j:I

    and-int/lit8 v2, v2, 0x2

    if-ne v2, v4, :cond_1

    .line 11220
    iget-object v2, p0, Ldcu;->b:Ljava/lang/String;

    .line 1759
    invoke-static {v4, v2}, Lddo;->b(ILjava/lang/String;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_1
    move v2, v1

    move v3, v0

    .line 1761
    :goto_2
    iget-object v0, p0, Ldcu;->d:Lddw;

    invoke-interface {v0}, Lddw;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 1762
    const/4 v4, 0x3

    iget-object v0, p0, Ldcu;->d:Lddw;

    .line 1763
    invoke-interface {v0, v2}, Lddw;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldea;

    invoke-static {v4, v0}, Lddo;->b(ILdea;)I

    move-result v0

    add-int/2addr v3, v0

    .line 1761
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    .line 1765
    :cond_2
    iget v0, p0, Ldcu;->j:I

    and-int/lit8 v0, v0, 0x8

    if-ne v0, v6, :cond_3

    .line 11441
    iget-object v0, p0, Ldcu;->e:Ljava/lang/String;

    .line 1767
    invoke-static {v5, v0}, Lddo;->b(ILjava/lang/String;)I

    move-result v0

    add-int/2addr v3, v0

    .line 1769
    :cond_3
    :goto_3
    iget-object v0, p0, Ldcu;->f:Lddw;

    invoke-interface {v0}, Lddw;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 1770
    const/4 v2, 0x5

    iget-object v0, p0, Ldcu;->f:Lddw;

    .line 1771
    invoke-interface {v0, v1}, Lddw;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldea;

    invoke-static {v2, v0}, Lddo;->b(ILdea;)I

    move-result v0

    add-int/2addr v3, v0

    .line 1769
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 1773
    :cond_4
    iget v0, p0, Ldcu;->j:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_5

    .line 1774
    const/4 v0, 0x6

    iget v1, p0, Ldcu;->l:I

    .line 1775
    invoke-static {v0, v1}, Lddo;->c(II)I

    move-result v0

    add-int/2addr v3, v0

    .line 1777
    :cond_5
    iget v0, p0, Ldcu;->j:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_6

    .line 1778
    const/4 v0, 0x7

    .line 11677
    iget-object v1, p0, Ldcu;->g:Ljava/lang/String;

    .line 1779
    invoke-static {v0, v1}, Lddo;->b(ILjava/lang/String;)I

    move-result v0

    add-int/2addr v3, v0

    .line 1781
    :cond_6
    iget v0, p0, Ldcu;->j:I

    and-int/lit8 v0, v0, 0x4

    if-ne v0, v5, :cond_7

    .line 12271
    iget-object v0, p0, Ldcu;->c:Ljava/lang/String;

    .line 1783
    invoke-static {v6, v0}, Lddo;->b(ILjava/lang/String;)I

    move-result v0

    add-int/2addr v3, v0

    .line 1785
    :cond_7
    iget v0, p0, Ldcu;->j:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_8

    .line 1786
    const/16 v0, 0x9

    iget v1, p0, Ldcu;->k:I

    .line 1787
    invoke-static {v0, v1}, Lddo;->c(II)I

    move-result v0

    add-int/2addr v3, v0

    .line 1789
    :cond_8
    iget-object v0, p0, Ldcu;->h:Ldek;

    invoke-virtual {v0}, Ldek;->c()I

    move-result v0

    add-int/2addr v0, v3

    .line 1790
    iput v0, p0, Ldcu;->i:I

    goto/16 :goto_0

    :cond_9
    move v0, v1

    goto/16 :goto_1
.end method

.method protected final a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 2366
    sget-object v2, Ldcn;->a:[I

    add-int/lit8 v3, p1, -0x1

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 2456
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    .line 2368
    :pswitch_0
    new-instance p0, Ldcu;

    check-cast p2, Lddn;

    check-cast p3, Lddp;

    invoke-direct {p0, p2, p3}, Ldcu;-><init>(Lddn;Lddp;)V

    .line 2453
    :cond_0
    :goto_0
    return-object p0

    .line 2372
    :pswitch_1
    new-instance p0, Ldcu;

    sget-object v0, Lddv;->c:Lddn;

    .line 2375
    invoke-static {}, Lddp;->a()Lddp;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ldcu;-><init>(Lddn;Lddp;)V

    goto :goto_0

    .line 2378
    :pswitch_2
    sget-object p0, Ldcu;->n:Ldcu;

    goto :goto_0

    .line 2381
    :pswitch_3
    iget-object v0, p0, Ldcu;->d:Lddw;

    invoke-interface {v0}, Lddw;->b()V

    .line 2382
    iget-object v0, p0, Ldcu;->f:Lddw;

    invoke-interface {v0}, Lddw;->b()V

    .line 2383
    const/4 p0, 0x0

    goto :goto_0

    .line 2386
    :pswitch_4
    new-instance p0, Ldcv;

    .line 12868
    invoke-direct {p0}, Ldcv;-><init>()V

    goto :goto_0

    .line 13471
    :pswitch_5
    sget-object v2, Ldcu;->n:Ldcu;

    .line 2389
    if-eq p2, v2, :cond_0

    .line 2390
    check-cast p2, Ldcu;

    .line 14163
    iget v2, p2, Ldcu;->j:I

    and-int/lit8 v2, v2, 0x1

    if-ne v2, v0, :cond_7

    move v2, v0

    .line 2391
    :goto_1
    if-eqz v2, :cond_1

    .line 2392
    iget v2, p0, Ldcu;->j:I

    or-int/lit8 v2, v2, 0x1

    iput v2, p0, Ldcu;->j:I

    .line 2393
    iget-object v2, p2, Ldcu;->a:Ljava/lang/String;

    iput-object v2, p0, Ldcu;->a:Ljava/lang/String;

    .line 14214
    :cond_1
    iget v2, p2, Ldcu;->j:I

    and-int/lit8 v2, v2, 0x2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_8

    move v2, v0

    .line 2396
    :goto_2
    if-eqz v2, :cond_2

    .line 2397
    iget v2, p0, Ldcu;->j:I

    or-int/lit8 v2, v2, 0x2

    iput v2, p0, Ldcu;->j:I

    .line 2398
    iget-object v2, p2, Ldcu;->b:Ljava/lang/String;

    iput-object v2, p0, Ldcu;->b:Ljava/lang/String;

    .line 14265
    :cond_2
    iget v2, p2, Ldcu;->j:I

    and-int/lit8 v2, v2, 0x4

    const/4 v3, 0x4

    if-ne v2, v3, :cond_9

    move v2, v0

    .line 2401
    :goto_3
    if-eqz v2, :cond_3

    .line 2402
    iget v2, p0, Ldcu;->j:I

    or-int/lit8 v2, v2, 0x4

    iput v2, p0, Ldcu;->j:I

    .line 2403
    iget-object v2, p2, Ldcu;->c:Ljava/lang/String;

    iput-object v2, p0, Ldcu;->c:Ljava/lang/String;

    .line 2406
    :cond_3
    iget-object v2, p2, Ldcu;->d:Lddw;

    invoke-interface {v2}, Lddw;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    .line 2407
    iget-object v2, p0, Ldcu;->d:Lddw;

    invoke-interface {v2}, Lddw;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 2408
    iget-object v2, p2, Ldcu;->d:Lddw;

    iput-object v2, p0, Ldcu;->d:Lddw;

    .line 14435
    :cond_4
    :goto_4
    iget v2, p2, Ldcu;->j:I

    and-int/lit8 v2, v2, 0x8

    const/16 v3, 0x8

    if-ne v2, v3, :cond_c

    move v2, v0

    .line 2415
    :goto_5
    if-eqz v2, :cond_5

    .line 2416
    iget v2, p0, Ldcu;->j:I

    or-int/lit8 v2, v2, 0x8

    iput v2, p0, Ldcu;->j:I

    .line 2417
    iget-object v2, p2, Ldcu;->e:Ljava/lang/String;

    iput-object v2, p0, Ldcu;->e:Ljava/lang/String;

    .line 14486
    :cond_5
    iget v2, p2, Ldcu;->j:I

    and-int/lit8 v2, v2, 0x10

    const/16 v3, 0x10

    if-ne v2, v3, :cond_d

    move v2, v0

    .line 2420
    :goto_6
    if-eqz v2, :cond_f

    .line 14492
    iget v2, p2, Ldcu;->k:I

    invoke-static {v2}, Ldco;->a(I)Ldco;

    move-result-object v2

    .line 14493
    if-nez v2, :cond_6

    sget-object v2, Ldco;->a:Ldco;

    .line 14499
    :cond_6
    if-nez v2, :cond_e

    .line 14500
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    :cond_7
    move v2, v1

    .line 14163
    goto :goto_1

    :cond_8
    move v2, v1

    .line 14214
    goto :goto_2

    :cond_9
    move v2, v1

    .line 14265
    goto :goto_3

    .line 14345
    :cond_a
    iget-object v2, p0, Ldcu;->d:Lddw;

    invoke-interface {v2}, Lddw;->a()Z

    move-result v2

    if-nez v2, :cond_b

    .line 14346
    iget-object v2, p0, Ldcu;->d:Lddw;

    invoke-static {v2}, Ldcu;->a(Ljava/util/List;)Lddw;

    move-result-object v2

    iput-object v2, p0, Ldcu;->d:Lddw;

    .line 2411
    :cond_b
    iget-object v2, p0, Ldcu;->d:Lddw;

    iget-object v3, p2, Ldcu;->d:Lddw;

    invoke-interface {v2, v3}, Lddw;->addAll(Ljava/util/Collection;)Z

    goto :goto_4

    :cond_c
    move v2, v1

    .line 14435
    goto :goto_5

    :cond_d
    move v2, v1

    .line 14486
    goto :goto_6

    .line 14502
    :cond_e
    iget v3, p0, Ldcu;->j:I

    or-int/lit8 v3, v3, 0x10

    iput v3, p0, Ldcu;->j:I

    .line 15061
    iget v2, v2, Ldco;->d:I

    .line 14503
    iput v2, p0, Ldcu;->k:I

    .line 2423
    :cond_f
    iget-object v2, p2, Ldcu;->f:Lddw;

    invoke-interface {v2}, Lddw;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_10

    .line 2424
    iget-object v2, p0, Ldcu;->f:Lddw;

    invoke-interface {v2}, Lddw;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_11

    .line 2425
    iget-object v2, p2, Ldcu;->f:Lddw;

    iput-object v2, p0, Ldcu;->f:Lddw;

    .line 15638
    :cond_10
    :goto_7
    iget v2, p2, Ldcu;->j:I

    and-int/lit8 v2, v2, 0x20

    const/16 v3, 0x20

    if-ne v2, v3, :cond_13

    move v2, v0

    .line 2432
    :goto_8
    if-eqz v2, :cond_15

    .line 2433
    invoke-virtual {p2}, Ldcu;->b()Ldbw;

    move-result-object v2

    .line 15651
    if-nez v2, :cond_14

    .line 15652
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 15548
    :cond_11
    iget-object v2, p0, Ldcu;->f:Lddw;

    invoke-interface {v2}, Lddw;->a()Z

    move-result v2

    if-nez v2, :cond_12

    .line 15549
    iget-object v2, p0, Ldcu;->f:Lddw;

    invoke-static {v2}, Ldcu;->a(Ljava/util/List;)Lddw;

    move-result-object v2

    iput-object v2, p0, Ldcu;->f:Lddw;

    .line 2428
    :cond_12
    iget-object v2, p0, Ldcu;->f:Lddw;

    iget-object v3, p2, Ldcu;->f:Lddw;

    invoke-interface {v2, v3}, Lddw;->addAll(Ljava/util/Collection;)Z

    goto :goto_7

    :cond_13
    move v2, v1

    .line 15638
    goto :goto_8

    .line 15654
    :cond_14
    iget v3, p0, Ldcu;->j:I

    or-int/lit8 v3, v3, 0x20

    iput v3, p0, Ldcu;->j:I

    .line 16173
    iget v2, v2, Ldbw;->b:I

    .line 15655
    iput v2, p0, Ldcu;->l:I

    .line 16671
    :cond_15
    iget v2, p2, Ldcu;->j:I

    and-int/lit8 v2, v2, 0x40

    const/16 v3, 0x40

    if-ne v2, v3, :cond_17

    .line 2435
    :goto_9
    if-eqz v0, :cond_16

    .line 2436
    iget v0, p0, Ldcu;->j:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Ldcu;->j:I

    .line 2437
    iget-object v0, p2, Ldcu;->g:Ljava/lang/String;

    iput-object v0, p0, Ldcu;->g:Ljava/lang/String;

    .line 2440
    :cond_16
    iget-object v0, p2, Ldcu;->h:Ldek;

    invoke-virtual {p0, v0}, Ldcu;->a(Ldek;)V

    goto/16 :goto_0

    :cond_17
    move v0, v1

    .line 16671
    goto :goto_9

    .line 2444
    :pswitch_6
    sget-object p0, Ldcu;->n:Ldcu;

    goto/16 :goto_0

    .line 2447
    :pswitch_7
    sget-object v0, Ldcu;->o:Ldee;

    if-nez v0, :cond_19

    const-class v1, Ldcu;

    monitor-enter v1

    .line 2448
    :try_start_0
    sget-object v0, Ldcu;->o:Ldee;

    if-nez v0, :cond_18

    .line 2449
    new-instance v0, Ldds;

    sget-object v2, Ldcu;->n:Ldcu;

    invoke-direct {v0, v2}, Ldds;-><init>(Lddq;)V

    sput-object v0, Ldcu;->o:Ldee;

    .line 2451
    :cond_18
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2453
    :cond_19
    sget-object p0, Ldcu;->o:Ldee;

    goto/16 :goto_0

    .line 2451
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 2366
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public final a(Lddo;)V
    .locals 6

    .prologue
    const/16 v5, 0x8

    const/4 v4, 0x4

    const/4 v3, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1718
    iget v0, p0, Ldcu;->j:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 9169
    iget-object v0, p0, Ldcu;->a:Ljava/lang/String;

    .line 1719
    invoke-virtual {p1, v1, v0}, Lddo;->a(ILjava/lang/String;)V

    .line 1721
    :cond_0
    iget v0, p0, Ldcu;->j:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v3, :cond_1

    .line 9220
    iget-object v0, p0, Ldcu;->b:Ljava/lang/String;

    .line 1722
    invoke-virtual {p1, v3, v0}, Lddo;->a(ILjava/lang/String;)V

    :cond_1
    move v1, v2

    .line 1724
    :goto_0
    iget-object v0, p0, Ldcu;->d:Lddw;

    invoke-interface {v0}, Lddw;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 1725
    const/4 v3, 0x3

    iget-object v0, p0, Ldcu;->d:Lddw;

    invoke-interface {v0, v1}, Lddw;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldea;

    invoke-virtual {p1, v3, v0}, Lddo;->a(ILdea;)V

    .line 1724
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1727
    :cond_2
    iget v0, p0, Ldcu;->j:I

    and-int/lit8 v0, v0, 0x8

    if-ne v0, v5, :cond_3

    .line 9441
    iget-object v0, p0, Ldcu;->e:Ljava/lang/String;

    .line 1728
    invoke-virtual {p1, v4, v0}, Lddo;->a(ILjava/lang/String;)V

    .line 1730
    :cond_3
    :goto_1
    iget-object v0, p0, Ldcu;->f:Lddw;

    invoke-interface {v0}, Lddw;->size()I

    move-result v0

    if-ge v2, v0, :cond_4

    .line 1731
    const/4 v1, 0x5

    iget-object v0, p0, Ldcu;->f:Lddw;

    invoke-interface {v0, v2}, Lddw;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldea;

    invoke-virtual {p1, v1, v0}, Lddo;->a(ILdea;)V

    .line 1730
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 1733
    :cond_4
    iget v0, p0, Ldcu;->j:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_5

    .line 1734
    const/4 v0, 0x6

    iget v1, p0, Ldcu;->l:I

    invoke-virtual {p1, v0, v1}, Lddo;->a(II)V

    .line 1736
    :cond_5
    iget v0, p0, Ldcu;->j:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_6

    .line 1737
    const/4 v0, 0x7

    .line 9677
    iget-object v1, p0, Ldcu;->g:Ljava/lang/String;

    .line 1737
    invoke-virtual {p1, v0, v1}, Lddo;->a(ILjava/lang/String;)V

    .line 1739
    :cond_6
    iget v0, p0, Ldcu;->j:I

    and-int/lit8 v0, v0, 0x4

    if-ne v0, v4, :cond_7

    .line 10271
    iget-object v0, p0, Ldcu;->c:Ljava/lang/String;

    .line 1740
    invoke-virtual {p1, v5, v0}, Lddo;->a(ILjava/lang/String;)V

    .line 1742
    :cond_7
    iget v0, p0, Ldcu;->j:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_8

    .line 1743
    const/16 v0, 0x9

    iget v1, p0, Ldcu;->k:I

    invoke-virtual {p1, v0, v1}, Lddo;->a(II)V

    .line 1745
    :cond_8
    iget-object v0, p0, Ldcu;->h:Ldek;

    invoke-virtual {v0, p1}, Ldek;->a(Lddo;)V

    .line 1746
    return-void
.end method

.method public final b()Ldbw;
    .locals 1

    .prologue
    .line 1644
    iget v0, p0, Ldcu;->l:I

    invoke-static {v0}, Ldbw;->a(I)Ldbw;

    move-result-object v0

    .line 1645
    if-nez v0, :cond_0

    sget-object v0, Ldbw;->a:Ldbw;

    :cond_0
    return-object v0
.end method
