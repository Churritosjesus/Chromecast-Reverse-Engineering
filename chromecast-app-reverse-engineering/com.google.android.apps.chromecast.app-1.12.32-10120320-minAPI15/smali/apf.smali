.class final Lapf;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbvk;


# instance fields
.field private a:Lapd;

.field private synthetic b:Lape;


# direct methods
.method public constructor <init>(Lape;Lapd;)V
    .locals 0

    .prologue
    .line 170
    iput-object p1, p0, Lapf;->b:Lape;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 171
    iput-object p2, p0, Lapf;->a:Lapd;

    .line 172
    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 6

    .prologue
    .line 176
    iget-object v0, p0, Lapf;->a:Lapd;

    iget-object v1, p0, Lapf;->b:Lape;

    invoke-static {v1}, Lape;->a(Lape;)Lblp;

    move-result-object v1

    .line 1139
    new-instance v2, Ldcz;

    invoke-direct {v2}, Ldcz;-><init>()V

    .line 1140
    iget-object v3, v0, Lapd;->a:Ljava/lang/Integer;

    if-eqz v3, :cond_8

    .line 1141
    iget-object v1, v0, Lapd;->a:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v2, Ldcz;->b:I

    .line 1145
    :goto_0
    iget-object v1, v0, Lapd;->i:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 1146
    iget-object v1, v0, Lapd;->i:Ljava/lang/Integer;

    iput-object v1, v2, Ldcz;->a:Ljava/lang/Integer;

    .line 1148
    :cond_0
    iget-object v1, v0, Lapd;->f:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 1149
    iget-object v1, v0, Lapd;->f:Ljava/lang/String;

    iput-object v1, v2, Ldcz;->c:Ljava/lang/String;

    .line 1151
    :cond_1
    iget-object v1, v0, Lapd;->d:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    .line 1152
    iget-object v1, v0, Lapd;->d:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v4, v1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v2, Ldcz;->d:Ljava/lang/Long;

    .line 1154
    :cond_2
    iget-object v1, v0, Lapd;->e:Ljava/lang/Long;

    if-eqz v1, :cond_3

    .line 1155
    iget-object v1, v0, Lapd;->e:Ljava/lang/Long;

    iput-object v1, v2, Ldcz;->e:Ljava/lang/Long;

    .line 1157
    :cond_3
    iget-object v1, v0, Lapd;->c:Ljava/lang/Long;

    if-eqz v1, :cond_4

    .line 1158
    iget-object v1, v0, Lapd;->c:Ljava/lang/Long;

    iput-object v1, v2, Ldcz;->f:Ljava/lang/Long;

    .line 1160
    :cond_4
    iget-object v1, v0, Lapd;->g:Lddc;

    if-eqz v1, :cond_5

    .line 1161
    iget-object v1, v0, Lapd;->g:Lddc;

    iput-object v1, v2, Ldcz;->g:Lddc;

    .line 1163
    :cond_5
    iget-object v1, v0, Lapd;->h:Laph;

    if-eqz v1, :cond_7

    .line 1164
    new-instance v1, Ldde;

    invoke-direct {v1}, Ldde;-><init>()V

    iput-object v1, v2, Ldcz;->h:Ldde;

    .line 1165
    iget-object v1, v2, Ldcz;->h:Ldde;

    iget-object v3, v0, Lapd;->h:Laph;

    .line 2049
    iget v3, v3, Laph;->a:I

    .line 1165
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v1, Ldde;->a:Ljava/lang/Integer;

    .line 1166
    iget-object v1, v2, Ldcz;->h:Ldde;

    new-instance v3, Ldda;

    invoke-direct {v3}, Ldda;-><init>()V

    iput-object v3, v1, Ldde;->b:Ldda;

    .line 1167
    iget-object v1, v0, Lapd;->h:Laph;

    .line 2086
    iget-object v1, v1, Laph;->c:Ljava/lang/Integer;

    .line 1167
    if-eqz v1, :cond_6

    .line 1168
    iget-object v1, v2, Ldcz;->h:Ldde;

    iget-object v1, v1, Ldde;->b:Ldda;

    iget-object v3, v0, Lapd;->h:Laph;

    .line 3086
    iget-object v3, v3, Laph;->c:Ljava/lang/Integer;

    .line 1169
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iput v3, v1, Ldda;->c:I

    .line 1171
    :cond_6
    iget-object v1, v2, Ldcz;->h:Ldde;

    iget-object v1, v1, Ldde;->b:Ldda;

    iget-object v3, v0, Lapd;->h:Laph;

    invoke-virtual {v3}, Laph;->a()Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v1, Ldda;->a:Ljava/lang/Long;

    .line 1172
    iget-object v1, v2, Ldcz;->h:Ldde;

    iget-object v1, v1, Ldde;->b:Ldda;

    iget-object v3, v0, Lapd;->h:Laph;

    .line 4078
    iget-object v3, v3, Laph;->b:Ljava/lang/String;

    .line 1172
    iput-object v3, v1, Ldda;->b:Ljava/lang/String;

    .line 1173
    iget-object v1, v2, Ldcz;->h:Ldde;

    iget-object v1, v1, Ldde;->b:Ldda;

    iget-object v0, v0, Lapd;->h:Laph;

    .line 4082
    iget-object v0, v0, Laph;->d:Ljava/lang/String;

    .line 1173
    iput-object v0, v1, Ldda;->d:Ljava/lang/String;

    .line 177
    :cond_7
    invoke-static {v2}, Ldew;->a(Ldew;)[B

    move-result-object v0

    return-object v0

    .line 1143
    :cond_8
    const-string v3, "mEventType should not be null"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v4}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0
.end method
