.class final Lbki;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbwn;


# instance fields
.field private synthetic a:Lbkh;


# direct methods
.method constructor <init>(Lbkh;)V
    .locals 0

    .prologue
    .line 129
    iput-object p1, p0, Lbki;->a:Lbkh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lbwm;)V
    .locals 8

    .prologue
    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 129
    check-cast p1, Lctn;

    .line 1132
    iget-object v0, p0, Lbki;->a:Lbkh;

    .line 2020
    const/4 v1, 0x0

    iput-object v1, v0, Lbkh;->a:Lbwj;

    .line 1133
    invoke-virtual {p1}, Lctn;->b()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1136
    iget-object v0, p0, Lbki;->a:Lbkh;

    .line 3020
    iget-object v0, v0, Lbkh;->b:Lbwj;

    .line 1136
    if-nez v0, :cond_0

    iget-object v0, p0, Lbki;->a:Lbkh;

    .line 4020
    iget-object v0, v0, Lbkh;->e:Lbkk;

    .line 1136
    if-eqz v0, :cond_0

    .line 1137
    iget-object v0, p0, Lbki;->a:Lbkh;

    .line 5020
    iget-object v0, v0, Lbkh;->e:Lbkk;

    .line 1137
    invoke-interface {v0}, Lbkk;->f()V

    .line 1139
    :cond_0
    :goto_0
    return-void

    .line 1141
    :cond_1
    iget-object v0, p0, Lbki;->a:Lbkh;

    .line 6020
    iput-object p1, v0, Lbkh;->c:Lctn;

    .line 1142
    iget-object v0, p0, Lbki;->a:Lbkh;

    iget-object v1, p0, Lbki;->a:Lbkh;

    .line 7020
    iget-object v1, v1, Lbkh;->c:Lctn;

    .line 1142
    invoke-virtual {v1}, Lctn;->c()Lctk;

    move-result-object v1

    .line 8020
    iput-object v1, v0, Lbkh;->d:Lctk;

    .line 1150
    :try_start_0
    iget-object v0, p0, Lbki;->a:Lbkh;

    .line 9020
    iget-object v0, v0, Lbkh;->d:Lctk;

    .line 1152
    const-string v1, "announcements"

    invoke-virtual {v0, v1}, Lctk;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    const/4 v1, 0x0

    .line 1151
    invoke-static {v0, v1}, Landroid/util/Base64;->decode([BI)[B

    move-result-object v0

    .line 9103
    new-instance v1, Ldam;

    invoke-direct {v1}, Ldam;-><init>()V

    invoke-static {v1, v0}, Ldew;->a(Ldew;[B)Ldew;

    move-result-object v0

    check-cast v0, Ldam;

    .line 1154
    iget-object v1, p0, Lbki;->a:Lbkh;

    .line 10020
    iget-object v1, v1, Lbkh;->g:Lbke;

    .line 1154
    iget-object v0, v0, Ldam;->a:[Ldal;

    .line 10117
    iput-object v0, v1, Lbke;->e:[Ldal;

    .line 10118
    invoke-virtual {v1}, Lbke;->a()V
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    .line 1164
    :goto_1
    :try_start_1
    iget-object v0, p0, Lbki;->a:Lbkh;

    .line 12020
    iget-object v0, v0, Lbkh;->d:Lctk;

    .line 1166
    const-string v1, "tutorials"

    invoke-virtual {v0, v1}, Lctk;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    const/4 v1, 0x0

    .line 1165
    invoke-static {v0, v1}, Landroid/util/Base64;->decode([BI)[B

    move-result-object v0

    .line 12103
    new-instance v1, Ldao;

    invoke-direct {v1}, Ldao;-><init>()V

    invoke-static {v1, v0}, Ldew;->a(Ldew;[B)Ldew;

    move-result-object v0

    check-cast v0, Ldao;

    .line 1168
    iget-object v1, p0, Lbki;->a:Lbkh;

    .line 13020
    iget-object v1, v1, Lbkh;->h:Lblv;

    .line 1168
    iget-object v0, v0, Ldao;->a:[Ldan;

    .line 14019
    iput-object v0, v1, Lblv;->a:[Ldan;
    :try_end_1
    .catch Ldev; {:try_start_1 .. :try_end_1} :catch_1

    .line 1177
    :goto_2
    iget-object v0, p0, Lbki;->a:Lbkh;

    .line 16020
    iget-object v0, v0, Lbkh;->b:Lbwj;

    .line 1177
    if-nez v0, :cond_0

    .line 1178
    iget-object v0, p0, Lbki;->a:Lbkh;

    .line 17020
    iget-object v0, v0, Lbkh;->e:Lbkk;

    .line 1178
    if-eqz v0, :cond_0

    .line 1179
    iget-object v0, p0, Lbki;->a:Lbkh;

    .line 18020
    iget-object v0, v0, Lbkh;->e:Lbkk;

    .line 1179
    invoke-interface {v0}, Lbkk;->f()V

    goto :goto_0

    .line 1155
    :catch_0
    move-exception v0

    .line 1156
    iget-object v1, p0, Lbki;->a:Lbkh;

    .line 11020
    iget-object v1, v1, Lbkh;->f:Lblp;

    .line 1156
    const-string v2, "Failed to properly load announcements from container: %s: %s"

    new-array v3, v7, [Ljava/lang/Object;

    .line 1157
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v4

    .line 1158
    invoke-virtual {v4}, Lcom/google/android/apps/chromecast/app/SetupApplication;->c()Lbli;

    move-result-object v4

    invoke-virtual {v4}, Lbli;->b()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    .line 1159
    invoke-virtual {v0}, Ldev;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v6

    .line 1156
    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 1169
    :catch_1
    move-exception v0

    .line 1170
    iget-object v1, p0, Lbki;->a:Lbkh;

    .line 15020
    iget-object v1, v1, Lbkh;->f:Lblp;

    .line 1170
    const-string v2, "Failed to properly load tutorials from container: %s: %s"

    new-array v3, v7, [Ljava/lang/Object;

    .line 1171
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v4

    .line 1172
    invoke-virtual {v4}, Lcom/google/android/apps/chromecast/app/SetupApplication;->c()Lbli;

    move-result-object v4

    invoke-virtual {v4}, Lbli;->b()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    .line 1173
    invoke-virtual {v0}, Ldev;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v6

    .line 1170
    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2
.end method
