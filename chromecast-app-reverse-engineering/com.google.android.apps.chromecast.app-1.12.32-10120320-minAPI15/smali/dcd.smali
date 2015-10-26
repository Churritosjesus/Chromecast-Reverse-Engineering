.class public final Ldcd;
.super Ldew;
.source "PG"


# instance fields
.field public a:[Ldce;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/Integer;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 122
    invoke-direct {p0}, Ldew;-><init>()V

    .line 1127
    iput-object v1, p0, Ldcd;->b:Ljava/lang/String;

    .line 1128
    invoke-static {}, Ldce;->b()[Ldce;

    move-result-object v0

    iput-object v0, p0, Ldcd;->a:[Ldce;

    .line 1129
    iput-object v1, p0, Ldcd;->c:Ljava/lang/String;

    .line 1130
    iput-object v1, p0, Ldcd;->d:Ljava/lang/Integer;

    .line 1131
    iput-object v1, p0, Ldcd;->e:Ljava/lang/String;

    .line 1132
    const/4 v0, -0x1

    iput v0, p0, Ldcd;->t:I

    .line 124
    return-void
.end method

.method public static a([B)Ldcd;
    .locals 1

    .prologue
    .line 259
    new-instance v0, Ldcd;

    invoke-direct {v0}, Ldcd;-><init>()V

    invoke-static {v0, p0}, Ldew;->a(Ldew;[B)Ldew;

    move-result-object v0

    check-cast v0, Ldcd;

    return-object v0
.end method


# virtual methods
.method protected final a()I
    .locals 5

    .prologue
    .line 164
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 165
    iget-object v1, p0, Ldcd;->b:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 166
    const/4 v1, 0x1

    iget-object v2, p0, Ldcd;->b:Ljava/lang/String;

    .line 167
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 169
    :cond_0
    iget-object v1, p0, Ldcd;->a:[Ldce;

    if-eqz v1, :cond_3

    iget-object v1, p0, Ldcd;->a:[Ldce;

    array-length v1, v1

    if-lez v1, :cond_3

    .line 170
    const/4 v1, 0x0

    move v4, v1

    move v1, v0

    move v0, v4

    :goto_0
    iget-object v2, p0, Ldcd;->a:[Ldce;

    array-length v2, v2

    if-ge v0, v2, :cond_2

    .line 171
    iget-object v2, p0, Ldcd;->a:[Ldce;

    aget-object v2, v2, v0

    .line 172
    if-eqz v2, :cond_1

    .line 173
    const/4 v3, 0x2

    .line 174
    invoke-static {v3, v2}, Ldep;->b(ILdew;)I

    move-result v2

    add-int/2addr v1, v2

    .line 170
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    .line 178
    :cond_3
    iget-object v1, p0, Ldcd;->c:Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 179
    const/4 v1, 0x3

    iget-object v2, p0, Ldcd;->c:Ljava/lang/String;

    .line 180
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 182
    :cond_4
    iget-object v1, p0, Ldcd;->d:Ljava/lang/Integer;

    if-eqz v1, :cond_5

    .line 183
    const/4 v1, 0x4

    iget-object v2, p0, Ldcd;->d:Ljava/lang/Integer;

    .line 184
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 186
    :cond_5
    iget-object v1, p0, Ldcd;->e:Ljava/lang/String;

    if-eqz v1, :cond_6

    .line 187
    const/4 v1, 0x5

    iget-object v2, p0, Ldcd;->e:Ljava/lang/String;

    .line 188
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 190
    :cond_6
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 5
    .line 1198
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1199
    sparse-switch v0, :sswitch_data_0

    .line 1203
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1204
    :sswitch_0
    return-object p0

    .line 1209
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldcd;->b:Ljava/lang/String;

    goto :goto_0

    .line 1213
    :sswitch_2
    const/16 v0, 0x12

    .line 1214
    invoke-static {p1, v0}, Ldey;->b(Ldeo;I)I

    move-result v2

    .line 1215
    iget-object v0, p0, Ldcd;->a:[Ldce;

    if-nez v0, :cond_2

    move v0, v1

    .line 1216
    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Ldce;

    .line 1218
    if-eqz v0, :cond_1

    .line 1219
    iget-object v3, p0, Ldcd;->a:[Ldce;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1221
    :cond_1
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_3

    .line 1222
    new-instance v3, Ldce;

    invoke-direct {v3}, Ldce;-><init>()V

    aput-object v3, v2, v0

    .line 1223
    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Ldeo;->a(Ldew;)V

    .line 1224
    invoke-virtual {p1}, Ldeo;->a()I

    .line 1221
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1215
    :cond_2
    iget-object v0, p0, Ldcd;->a:[Ldce;

    array-length v0, v0

    goto :goto_1

    .line 1227
    :cond_3
    new-instance v3, Ldce;

    invoke-direct {v3}, Ldce;-><init>()V

    aput-object v3, v2, v0

    .line 1228
    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    .line 1229
    iput-object v2, p0, Ldcd;->a:[Ldce;

    goto :goto_0

    .line 1233
    :sswitch_3
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldcd;->c:Ljava/lang/String;

    goto :goto_0

    .line 2169
    :sswitch_4
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 1238
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1244
    :pswitch_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ldcd;->d:Ljava/lang/Integer;

    goto :goto_0

    .line 1250
    :sswitch_5
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldcd;->e:Ljava/lang/String;

    goto :goto_0

    .line 1199
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x20 -> :sswitch_4
        0x2a -> :sswitch_5
    .end sparse-switch

    .line 1238
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Ldep;)V
    .locals 3

    .prologue
    .line 139
    iget-object v0, p0, Ldcd;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 140
    const/4 v0, 0x1

    iget-object v1, p0, Ldcd;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 142
    :cond_0
    iget-object v0, p0, Ldcd;->a:[Ldce;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ldcd;->a:[Ldce;

    array-length v0, v0

    if-lez v0, :cond_2

    .line 143
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ldcd;->a:[Ldce;

    array-length v1, v1

    if-ge v0, v1, :cond_2

    .line 144
    iget-object v1, p0, Ldcd;->a:[Ldce;

    aget-object v1, v1, v0

    .line 145
    if-eqz v1, :cond_1

    .line 146
    const/4 v2, 0x2

    invoke-virtual {p1, v2, v1}, Ldep;->a(ILdew;)V

    .line 143
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 150
    :cond_2
    iget-object v0, p0, Ldcd;->c:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 151
    const/4 v0, 0x3

    iget-object v1, p0, Ldcd;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 153
    :cond_3
    iget-object v0, p0, Ldcd;->d:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    .line 154
    const/4 v0, 0x4

    iget-object v1, p0, Ldcd;->d:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 156
    :cond_4
    iget-object v0, p0, Ldcd;->e:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 157
    const/4 v0, 0x5

    iget-object v1, p0, Ldcd;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 159
    :cond_5
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 160
    return-void
.end method
