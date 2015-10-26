.class public final Laus;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Landroid/os/Handler;

.field private final b:Lblp;

.field private c:Ljava/util/ArrayList;

.field private d:Lbdf;

.field private e:I

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILandroid/os/Handler;)V
    .locals 2

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p2, p0, Laus;->a:Landroid/os/Handler;

    .line 44
    new-instance v0, Lblp;

    const-string v1, "AttributeReadQueue"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Laus;->b:Lblp;

    .line 1056
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1057
    sget-object v1, Lavp;->c:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1058
    and-int/lit8 v1, p1, 0x2

    if-eqz v1, :cond_0

    .line 1059
    sget-object v1, Lavp;->d:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1061
    :cond_0
    and-int/lit8 v1, p1, 0x8

    if-eqz v1, :cond_1

    .line 1062
    sget-object v1, Lavp;->f:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1063
    sget-object v1, Lavp;->o:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1064
    sget-object v1, Lavp;->r:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1065
    sget-object v1, Lavp;->s:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1067
    :cond_1
    and-int/lit8 v1, p1, 0x20

    if-eqz v1, :cond_2

    .line 1068
    sget-object v1, Lavp;->t:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1070
    :cond_2
    and-int/lit16 v1, p1, 0x80

    if-eqz v1, :cond_3

    .line 1071
    sget-object v1, Lavp;->e:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1072
    sget-object v1, Lavp;->p:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1074
    :cond_3
    and-int/lit16 v1, p1, 0x1000

    if-eqz v1, :cond_4

    .line 1075
    sget-object v1, Lavp;->i:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1076
    sget-object v1, Lavp;->q:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1077
    sget-object v1, Lavp;->g:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1078
    sget-object v1, Lavp;->h:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1080
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    iput v1, p0, Laus;->e:I

    .line 45
    iput-object v0, p0, Laus;->c:Ljava/util/ArrayList;

    .line 46
    new-instance v0, Lbdf;

    invoke-direct {v0}, Lbdf;-><init>()V

    iput-object v0, p0, Laus;->d:Lbdf;

    .line 47
    return-void
.end method

.method private static a([B)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 209
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move v0, v1

    .line 210
    :goto_0
    array-length v3, p0

    if-ge v0, v3, :cond_0

    .line 211
    const-string v3, "%02X"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aget-byte v5, p0, v0

    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 213
    :cond_0
    const-string v0, ":"

    invoke-static {v0, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a()V
    .locals 5

    .prologue
    .line 201
    iget-object v0, p0, Laus;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Laus;->g:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Laus;->h:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 202
    iget-object v0, p0, Laus;->h:Ljava/lang/String;

    sget-object v1, Lblj;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/util/Base64;->decode([BI)[B

    move-result-object v0

    .line 203
    iget-object v1, p0, Laus;->d:Lbdf;

    new-instance v2, Lbcv;

    iget-object v3, p0, Laus;->f:Ljava/lang/String;

    iget-object v4, p0, Laus;->g:Ljava/lang/String;

    invoke-direct {v2, v3, v4, v0}, Lbcv;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    .line 7736
    iput-object v2, v1, Lbdf;->U:Lbcv;

    .line 206
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lauv;)V
    .locals 6

    .prologue
    .line 91
    iget-object v0, p0, Laus;->d:Lbdf;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 1696
    iput-object v1, v0, Lbdf;->P:Ljava/lang/Boolean;

    .line 94
    iget-object v0, p0, Laus;->d:Lbdf;

    const/4 v1, 0x1

    .line 2688
    iput-boolean v1, v0, Lbdf;->O:Z

    .line 96
    iget-object v0, p0, Laus;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/UUID;

    .line 97
    invoke-static {v0}, Lavp;->a(Ljava/util/UUID;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 98
    new-instance v2, Lavm;

    .line 99
    invoke-static {v0}, Lavp;->b(Ljava/util/UUID;)Ljava/util/UUID;

    move-result-object v3

    new-instance v4, Laut;

    .line 100
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v5

    invoke-direct {v4, p0, v5, v0}, Laut;-><init>(Laus;Landroid/os/Looper;Ljava/util/UUID;)V

    invoke-direct {v2, v3, v0, v4}, Lavm;-><init>(Ljava/util/UUID;Ljava/util/UUID;Landroid/os/Handler;)V

    .line 117
    invoke-virtual {v2, p1}, Lavm;->a(Lauv;)V

    goto :goto_0

    .line 119
    :cond_0
    new-instance v2, Lawb;

    new-instance v3, Lauu;

    invoke-direct {v3, p0, v0}, Lauu;-><init>(Laus;Ljava/util/UUID;)V

    invoke-direct {v2, v0, v3}, Lawb;-><init>(Ljava/util/UUID;Lawc;)V

    .line 132
    invoke-virtual {p1, v2}, Lauv;->a(Lavr;)V

    goto :goto_0

    .line 135
    :cond_1
    return-void
.end method

.method public final a([BLjava/util/UUID;)V
    .locals 7

    .prologue
    const/4 v4, 0x0

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 138
    sget-object v0, Lavp;->c:Ljava/util/UUID;

    invoke-virtual {p2, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 139
    iget-object v0, p0, Laus;->d:Lbdf;

    aget-byte v3, p1, v1

    .line 3235
    iput v3, v0, Lbdf;->a:I

    .line 140
    new-array v0, v2, [Ljava/lang/Object;

    aget-byte v3, p1, v1

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    aput-object v3, v0, v1

    .line 190
    :cond_0
    :goto_0
    iget v0, p0, Laus;->e:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Laus;->e:I

    .line 191
    new-array v0, v2, [Ljava/lang/Object;

    iget-object v2, p0, Laus;->c:Ljava/util/ArrayList;

    aput-object v2, v0, v1

    .line 192
    iget v0, p0, Laus;->e:I

    if-nez v0, :cond_1

    .line 195
    iget-object v0, p0, Laus;->a:Landroid/os/Handler;

    iget-object v2, p0, Laus;->d:Lbdf;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 196
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 198
    :cond_1
    return-void

    .line 141
    :cond_2
    sget-object v0, Lavp;->t:Ljava/util/UUID;

    invoke-virtual {p2, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 4217
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move v0, v1

    .line 4218
    :goto_1
    array-length v4, p1

    if-ge v0, v4, :cond_3

    .line 4219
    aget-byte v4, p1, v0

    and-int/lit16 v4, v4, 0xff

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4218
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 4221
    :cond_3
    const-string v0, "."

    invoke-static {v0, v3}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    .line 143
    new-array v3, v2, [Ljava/lang/Object;

    aput-object v0, v3, v1

    .line 144
    iget-object v3, p0, Laus;->d:Lbdf;

    .line 4423
    iput-object v0, v3, Lbdf;->u:Ljava/lang/String;

    goto :goto_0

    .line 145
    :cond_4
    sget-object v0, Lavp;->r:Ljava/util/UUID;

    invoke-virtual {p2, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 146
    invoke-static {p1}, Laus;->a([B)Ljava/lang/String;

    move-result-object v0

    .line 147
    new-array v3, v2, [Ljava/lang/Object;

    aput-object v0, v3, v1

    .line 148
    iget-object v3, p0, Laus;->d:Lbdf;

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    .line 5378
    iput-object v0, v3, Lbdf;->p:Ljava/lang/String;

    goto :goto_0

    .line 149
    :cond_5
    sget-object v0, Lavp;->e:Ljava/util/UUID;

    invoke-virtual {p2, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 150
    iget-object v3, p0, Laus;->d:Lbdf;

    aget-byte v0, p1, v1

    if-ne v0, v2, :cond_6

    move v0, v2

    .line 5503
    :goto_2
    iput-boolean v0, v3, Lbdf;->E:Z

    goto :goto_0

    :cond_6
    move v0, v1

    .line 150
    goto :goto_2

    .line 151
    :cond_7
    sget-object v0, Lavp;->o:Ljava/util/UUID;

    invoke-virtual {p2, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 152
    invoke-static {p1}, Laus;->a([B)Ljava/lang/String;

    move-result-object v0

    .line 153
    new-array v3, v2, [Ljava/lang/Object;

    aput-object v0, v3, v1

    .line 154
    iget-object v3, p0, Laus;->d:Lbdf;

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lbdf;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 155
    :cond_8
    sget-object v0, Lavp;->p:Ljava/util/UUID;

    invoke-virtual {p2, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 156
    iget-object v0, p0, Laus;->d:Lbdf;

    aget-byte v3, p1, v1

    invoke-static {v3}, Lbdj;->a(I)Lbdj;

    move-result-object v3

    .line 5623
    iput-object v3, v0, Lbdf;->G:Lbdj;

    goto/16 :goto_0

    .line 157
    :cond_9
    sget-object v0, Lavp;->f:Ljava/util/UUID;

    invoke-virtual {p2, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 158
    iget-object v0, p0, Laus;->d:Lbdf;

    new-instance v3, Ljava/lang/String;

    sget-object v4, Lblj;->a:Ljava/nio/charset/Charset;

    invoke-direct {v3, p1, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 6399
    iput-object v3, v0, Lbdf;->r:Ljava/lang/String;

    goto/16 :goto_0

    .line 159
    :cond_a
    sget-object v0, Lavp;->q:Ljava/util/UUID;

    .line 160
    invoke-virtual {p2, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 164
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    new-instance v3, Ljava/lang/String;

    sget-object v5, Lblj;->a:Ljava/nio/charset/Charset;

    invoke-direct {v3, p1, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-direct {v0, v3}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v0

    .line 169
    :goto_3
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 170
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v0

    new-array v5, v0, [Ljava/lang/String;

    move v0, v1

    .line 171
    :goto_4
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v0, v6, :cond_b

    .line 172
    invoke-virtual {v3, v0, v4}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v0

    .line 171
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 167
    :catch_0
    move-exception v0

    iget-object v0, p0, Laus;->a:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    move-object v3, v4

    goto :goto_3

    .line 174
    :cond_b
    iget-object v0, p0, Laus;->d:Lbdf;

    .line 6747
    iput-object v5, v0, Lbdf;->V:[Ljava/lang/String;

    goto/16 :goto_0

    .line 176
    :cond_c
    sget-object v0, Lavp;->i:Ljava/util/UUID;

    invoke-virtual {p2, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 177
    new-instance v0, Ljava/lang/String;

    sget-object v3, Lblj;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    iput-object v0, p0, Laus;->f:Ljava/lang/String;

    .line 178
    invoke-direct {p0}, Laus;->a()V

    goto/16 :goto_0

    .line 179
    :cond_d
    sget-object v0, Lavp;->g:Ljava/util/UUID;

    invoke-virtual {p2, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 180
    new-instance v0, Ljava/lang/String;

    sget-object v3, Lblj;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    iput-object v0, p0, Laus;->g:Ljava/lang/String;

    .line 181
    invoke-direct {p0}, Laus;->a()V

    goto/16 :goto_0

    .line 182
    :cond_e
    sget-object v0, Lavp;->h:Ljava/util/UUID;

    invoke-virtual {p2, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 183
    new-instance v0, Ljava/lang/String;

    sget-object v3, Lblj;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    iput-object v0, p0, Laus;->h:Ljava/lang/String;

    .line 184
    invoke-direct {p0}, Laus;->a()V

    goto/16 :goto_0

    .line 185
    :cond_f
    sget-object v0, Lavp;->d:Ljava/util/UUID;

    invoke-virtual {p2, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 186
    iget-object v0, p0, Laus;->d:Lbdf;

    new-instance v3, Ljava/lang/String;

    sget-object v4, Lblj;->a:Ljava/nio/charset/Charset;

    invoke-direct {v3, p1, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 7247
    iput-object v3, v0, Lbdf;->b:Ljava/lang/String;

    goto/16 :goto_0

    .line 187
    :cond_10
    sget-object v0, Lavp;->s:Ljava/util/UUID;

    invoke-virtual {p2, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 188
    iget-object v0, p0, Laus;->d:Lbdf;

    new-instance v3, Ljava/lang/String;

    sget-object v4, Lblj;->a:Ljava/nio/charset/Charset;

    invoke-direct {v3, p1, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 7366
    iput-object v3, v0, Lbdf;->n:Ljava/lang/String;

    goto/16 :goto_0
.end method
