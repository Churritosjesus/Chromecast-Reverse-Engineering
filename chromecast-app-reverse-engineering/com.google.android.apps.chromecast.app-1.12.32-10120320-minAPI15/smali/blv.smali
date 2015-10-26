.class public final Lblv;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field a:[Ldan;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;ZI)Ldan;
    .locals 10

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 33
    iget-object v0, p0, Lblv;->a:[Ldan;

    if-nez v0, :cond_0

    move-object v0, v4

    .line 42
    :goto_0
    return-object v0

    :cond_0
    move v0, v1

    .line 36
    :goto_1
    iget-object v2, p0, Lblv;->a:[Ldan;

    array-length v2, v2

    if-ge v0, v2, :cond_14

    .line 37
    iget-object v2, p0, Lblv;->a:[Ldan;

    aget-object v5, v2, v0

    .line 1060
    if-eqz p1, :cond_2

    iget-object v2, v5, Ldan;->b:Ljava/lang/Long;

    if-eqz v2, :cond_1

    iget-object v2, v5, Ldan;->b:Ljava/lang/Long;

    .line 1061
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v8, v2

    cmp-long v2, v6, v8

    if-gtz v2, :cond_2

    :cond_1
    move v2, v1

    .line 37
    :goto_2
    if-eqz v2, :cond_13

    .line 38
    iget-object v1, p0, Lblv;->a:[Ldan;

    aget-object v0, v1, v0

    goto :goto_0

    .line 1066
    :cond_2
    iget-object v2, v5, Ldan;->g:[Ldap;

    if-nez v2, :cond_3

    move v2, v1

    .line 1067
    goto :goto_2

    .line 1070
    :cond_3
    iget-object v6, v5, Ldan;->d:[I

    .line 1122
    if-eqz v6, :cond_4

    array-length v2, v6

    if-nez v2, :cond_5

    :cond_4
    move v2, v3

    .line 1070
    :goto_3
    if-nez v2, :cond_8

    move v2, v1

    .line 1071
    goto :goto_2

    .line 1125
    :cond_5
    array-length v7, v6

    move v2, v1

    :goto_4
    if-ge v2, v7, :cond_7

    aget v8, v6, v2

    .line 1126
    if-nez v8, :cond_6

    move v2, v3

    .line 1127
    goto :goto_3

    .line 1125
    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_7
    move v2, v1

    .line 1131
    goto :goto_3

    .line 1074
    :cond_8
    iget-object v6, v5, Ldan;->e:[Ljava/lang/String;

    .line 1138
    if-eqz v6, :cond_9

    array-length v2, v6

    if-nez v2, :cond_a

    :cond_9
    move v2, v3

    .line 1074
    :goto_5
    if-nez v2, :cond_d

    move v2, v1

    .line 1075
    goto :goto_2

    .line 1141
    :cond_a
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->g()Z

    move-result v2

    if-eqz v2, :cond_c

    .line 1144
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v2

    .line 1335
    iget-object v7, v2, Lcom/google/android/apps/chromecast/app/SetupApplication;->c:Ljava/lang/String;

    .line 1145
    array-length v8, v6

    move v2, v1

    :goto_6
    if-ge v2, v8, :cond_c

    aget-object v9, v6, v2

    .line 1146
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    move v2, v3

    .line 1147
    goto :goto_5

    .line 1145
    :cond_b
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_c
    move v2, v1

    .line 1151
    goto :goto_5

    .line 1078
    :cond_d
    iget v2, v5, Ldan;->c:I

    if-nez v2, :cond_e

    move v2, v3

    :goto_7
    if-eq v2, p2, :cond_f

    move v2, v1

    .line 1079
    goto :goto_2

    :cond_e
    move v2, v1

    .line 1078
    goto :goto_7

    .line 1082
    :cond_f
    iget-object v2, v5, Ldan;->f:[I

    if-eqz v2, :cond_12

    iget-object v2, v5, Ldan;->f:[I

    array-length v2, v2

    if-lez v2, :cond_12

    .line 1083
    if-nez p3, :cond_10

    move v2, v1

    .line 1084
    goto :goto_2

    .line 2101
    :cond_10
    sget-object v2, Lblw;->a:[I

    add-int/lit8 v6, p3, -0x1

    aget v2, v2, v6

    packed-switch v2, :pswitch_data_0

    .line 2114
    const/4 v2, 0x5

    .line 1087
    :goto_8
    iget-object v6, v5, Ldan;->f:[I

    array-length v7, v6

    move v5, v1

    :goto_9
    if-ge v5, v7, :cond_11

    aget v8, v6, v5

    .line 1088
    if-eq v8, v2, :cond_12

    .line 1087
    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    :pswitch_0
    move v2, v1

    .line 2103
    goto :goto_8

    :pswitch_1
    move v2, v3

    .line 2105
    goto :goto_8

    .line 2107
    :pswitch_2
    const/4 v2, 0x2

    goto :goto_8

    .line 2109
    :pswitch_3
    const/4 v2, 0x3

    goto :goto_8

    .line 2111
    :pswitch_4
    const/4 v2, 0x4

    goto :goto_8

    :cond_11
    move v2, v1

    .line 1092
    goto/16 :goto_2

    :cond_12
    move v2, v3

    .line 1094
    goto/16 :goto_2

    .line 36
    :cond_13
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_1

    :cond_14
    move-object v0, v4

    .line 42
    goto/16 :goto_0

    .line 2101
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
