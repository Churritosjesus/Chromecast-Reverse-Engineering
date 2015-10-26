.class final Lalb;
.super Laky;
.source "PG"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field private c:Lajq;

.field private d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 279
    new-instance v0, Lald;

    invoke-direct {v0}, Lald;-><init>()V

    sput-object v0, Lalb;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Lakh;)V
    .locals 0

    .prologue
    .line 56
    invoke-direct {p0, p1}, Laky;-><init>(Lakh;)V

    .line 57
    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 264
    invoke-direct {p0, p1}, Laky;-><init>(Landroid/os/Parcel;)V

    .line 265
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lalb;->d:Ljava/lang/String;

    .line 266
    return-void
.end method


# virtual methods
.method final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    const-string v0, "web_view"

    return-object v0
.end method

.method final a(Lakl;Landroid/os/Bundle;Lafq;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v2, 0x0

    .line 143
    if-eqz p2, :cond_2

    .line 145
    const-string v0, "e2e"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    const-string v0, "e2e"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lalb;->d:Ljava/lang/String;

    .line 8449
    :cond_0
    :try_start_0
    iget-object v0, p1, Lakl;->b:Ljava/util/Set;

    .line 151
    sget-object v1, Lafl;->c:Lafl;

    .line 8466
    iget-object v3, p1, Lakl;->d:Ljava/lang/String;

    .line 150
    invoke-static {v0, p2, v1, v3}, Lalb;->a(Ljava/util/Collection;Landroid/os/Bundle;Lafl;Ljava/lang/String;)Lafb;

    move-result-object v1

    .line 155
    iget-object v0, p0, Lalb;->b:Lakh;

    .line 9099
    iget-object v0, v0, Lakh;->f:Lakl;

    .line 155
    invoke-static {v0, v1}, Lakn;->a(Lakl;Lafb;)Lakn;

    move-result-object v0

    .line 162
    iget-object v3, p0, Lalb;->b:Lakh;

    .line 163
    invoke-virtual {v3}, Lakh;->a()Lm;

    move-result-object v3

    invoke-static {v3}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    move-result-object v3

    .line 164
    invoke-virtual {v3}, Landroid/webkit/CookieSyncManager;->sync()V

    .line 9172
    iget-object v1, v1, Lafb;->d:Ljava/lang/String;

    .line 9202
    iget-object v3, p0, Lalb;->b:Lakh;

    invoke-virtual {v3}, Lakh;->a()Lm;

    move-result-object v3

    .line 9203
    const-string v4, "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY"

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 9206
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    const-string v4, "TOKEN"

    .line 9207
    invoke-interface {v3, v4, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 9208
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Lafq; {:try_start_0 .. :try_end_0} :catch_0

    .line 194
    :goto_0
    iget-object v1, p0, Lalb;->d:Ljava/lang/String;

    invoke-static {v1}, Laji;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 195
    iget-object v1, p0, Lalb;->d:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lalb;->a(Ljava/lang/String;)V

    .line 198
    :cond_1
    iget-object v1, p0, Lalb;->b:Lakh;

    invoke-virtual {v1, v0}, Lakh;->a(Lakn;)V

    .line 199
    return-void

    .line 166
    :catch_0
    move-exception v0

    .line 167
    iget-object v1, p0, Lalb;->b:Lakh;

    .line 10099
    iget-object v1, v1, Lakh;->f:Lakl;

    .line 170
    invoke-virtual {v0}, Lafq;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 167
    invoke-static {v1, v2, v0}, Lakn;->a(Lakl;Ljava/lang/String;Ljava/lang/String;)Lakn;

    move-result-object v0

    goto :goto_0

    .line 173
    :cond_2
    instance-of v0, p3, Lafr;

    if-eqz v0, :cond_3

    .line 174
    iget-object v0, p0, Lalb;->b:Lakh;

    .line 11099
    iget-object v0, v0, Lakh;->f:Lakl;

    .line 174
    const-string v1, "User canceled log in."

    invoke-static {v0, v1}, Lakn;->a(Lakl;Ljava/lang/String;)Lakn;

    move-result-object v0

    goto :goto_0

    .line 179
    :cond_3
    iput-object v2, p0, Lalb;->d:Ljava/lang/String;

    .line 182
    invoke-virtual {p3}, Lafq;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 183
    instance-of v1, p3, Lafz;

    if-eqz v1, :cond_4

    .line 184
    check-cast p3, Lafz;

    .line 12048
    iget-object v0, p3, Lafz;->a:Lafs;

    .line 186
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v3, "%d"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    .line 12201
    iget v5, v0, Lafs;->b:I

    .line 186
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v1, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 187
    invoke-virtual {v0}, Lafs;->toString()Ljava/lang/String;

    move-result-object v0

    .line 189
    :goto_1
    iget-object v3, p0, Lalb;->b:Lakh;

    .line 13099
    iget-object v3, v3, Lakh;->f:Lakl;

    .line 189
    invoke-static {v3, v2, v0, v1}, Lakn;->a(Lakl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lakn;

    move-result-object v0

    goto :goto_0

    :cond_4
    move-object v1, v2

    goto :goto_1
.end method

.method final a(Lakl;)Z
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 79
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1449
    iget-object v0, p1, Lakl;->b:Ljava/util/Set;

    .line 80
    invoke-static {v0}, Laji;->a(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 81
    const-string v0, ","

    .line 2449
    iget-object v2, p1, Lakl;->b:Ljava/util/Set;

    .line 81
    invoke-static {v0, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    .line 82
    const-string v2, "scope"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    const-string v2, "scope"

    invoke-virtual {p0, v2, v0}, Lalb;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2462
    :cond_0
    iget-object v0, p1, Lakl;->c:Lajy;

    .line 87
    const-string v2, "default_audience"

    .line 3059
    iget-object v0, v0, Lajy;->b:Ljava/lang/String;

    .line 87
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    invoke-static {}, Lafb;->a()Lafb;

    move-result-object v0

    .line 91
    if-eqz v0, :cond_1

    .line 3172
    iget-object v0, v0, Lafb;->d:Ljava/lang/String;

    .line 92
    :goto_0
    if-eqz v0, :cond_2

    .line 3212
    iget-object v2, p0, Lalb;->b:Lakh;

    invoke-virtual {v2}, Lakh;->a()Lm;

    move-result-object v2

    .line 3213
    const-string v3, "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 3216
    const-string v3, "TOKEN"

    const-string v4, ""

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 93
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 94
    const-string v2, "access_token"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    const-string v0, "access_token"

    const-string v2, "1"

    invoke-virtual {p0, v0, v2}, Lalb;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 110
    :goto_1
    new-instance v0, Lalc;

    invoke-direct {v0, p0, p1}, Lalc;-><init>(Lalb;Lakl;)V

    .line 117
    invoke-static {}, Lakh;->g()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lalb;->d:Ljava/lang/String;

    .line 118
    const-string v2, "e2e"

    iget-object v3, p0, Lalb;->d:Ljava/lang/String;

    invoke-virtual {p0, v2, v3}, Lalb;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 120
    iget-object v2, p0, Lalb;->b:Lakh;

    invoke-virtual {v2}, Lakh;->a()Lm;

    move-result-object v2

    .line 121
    new-instance v3, Lale;

    .line 3466
    iget-object v4, p1, Lakl;->d:Ljava/lang/String;

    .line 123
    invoke-direct {v3, v2, v4, v1}, Lale;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v1, p0, Lalb;->d:Ljava/lang/String;

    .line 4230
    iput-object v1, v3, Lale;->f:Ljava/lang/String;

    .line 4474
    iget-boolean v1, p1, Lakl;->f:Z

    .line 5235
    iput-boolean v1, v3, Lale;->g:Z

    .line 5591
    iput-object v0, v3, Lajv;->d:Lajx;

    .line 128
    invoke-static {}, Lafv;->j()I

    move-result v0

    .line 6580
    iput v0, v3, Lajv;->c:I

    .line 129
    invoke-virtual {v3}, Lajv;->a()Lajq;

    move-result-object v0

    iput-object v0, p0, Lalb;->c:Lajq;

    .line 131
    new-instance v0, Lain;

    invoke-direct {v0}, Lain;-><init>()V

    .line 132
    invoke-virtual {v0, v5}, Lain;->c(Z)V

    .line 133
    iget-object v1, p0, Lalb;->c:Lajq;

    .line 7050
    iput-object v1, v0, Lain;->Z:Landroid/app/Dialog;

    .line 7808
    iget-object v1, v2, Lm;->b:Lt;

    .line 134
    const-string v2, "FacebookDialogFragment"

    invoke-virtual {v0, v1, v2}, Lain;->a(Lr;Ljava/lang/String;)V

    .line 137
    return v5

    .line 91
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 104
    :cond_2
    iget-object v0, p0, Lalb;->b:Lakh;

    invoke-virtual {v0}, Lakh;->a()Lm;

    move-result-object v0

    invoke-static {v0}, Laji;->b(Landroid/content/Context;)V

    .line 105
    const-string v0, "access_token"

    const-string v2, "0"

    invoke-virtual {p0, v0, v2}, Lalb;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1
.end method

.method final b()V
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lalb;->c:Lajq;

    if-eqz v0, :cond_0

    .line 72
    iget-object v0, p0, Lalb;->c:Lajq;

    invoke-virtual {v0}, Lajq;->cancel()V

    .line 73
    const/4 v0, 0x0

    iput-object v0, p0, Lalb;->c:Lajq;

    .line 75
    :cond_0
    return-void
.end method

.method final c()Z
    .locals 1

    .prologue
    .line 66
    const/4 v0, 0x1

    return v0
.end method

.method public final describeContents()I
    .locals 1

    .prologue
    .line 270
    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 275
    invoke-super {p0, p1, p2}, Laky;->writeToParcel(Landroid/os/Parcel;I)V

    .line 276
    iget-object v0, p0, Lalb;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 277
    return-void
.end method
