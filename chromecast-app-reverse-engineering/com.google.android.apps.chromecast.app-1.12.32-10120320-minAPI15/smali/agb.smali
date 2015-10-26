.class final Lagb;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lagf;


# instance fields
.field private synthetic a:Lagf;


# direct methods
.method constructor <init>(Laga;Lagf;)V
    .locals 0

    .prologue
    .line 894
    iput-object p2, p0, Lagb;->a:Lagf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lagp;)V
    .locals 9

    .prologue
    const/4 v4, 0x0

    .line 897
    .line 1122
    iget-object v0, p1, Lagp;->a:Lorg/json/JSONObject;

    .line 898
    if-eqz v0, :cond_3

    .line 899
    const-string v1, "__debug__"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 900
    :goto_0
    if-eqz v0, :cond_4

    .line 901
    const-string v1, "messages"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    move-object v6, v0

    .line 902
    :goto_1
    if-eqz v6, :cond_8

    .line 903
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_8

    .line 904
    invoke-virtual {v6, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 905
    if-eqz v3, :cond_5

    .line 906
    const-string v1, "message"

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 908
    :goto_3
    if-eqz v3, :cond_6

    .line 909
    const-string v1, "type"

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object v5, v1

    .line 911
    :goto_4
    if-eqz v3, :cond_7

    .line 912
    const-string v1, "link"

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object v3, v1

    .line 914
    :goto_5
    if-eqz v2, :cond_2

    if-eqz v5, :cond_2

    .line 915
    sget-object v1, Lags;->h:Lags;

    .line 916
    const-string v7, "warning"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 917
    sget-object v1, Lags;->g:Lags;

    .line 919
    :cond_0
    invoke-static {v3}, Laji;->a(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 920
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v7, v7, 0x7

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    add-int/2addr v7, v8

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, " Link: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 922
    :cond_1
    sget-object v3, Laga;->a:Ljava/lang/String;

    invoke-static {v1, v3, v2}, Laiw;->a(Lags;Ljava/lang/String;Ljava/lang/String;)V

    .line 903
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    move-object v0, v4

    .line 899
    goto :goto_0

    :cond_4
    move-object v6, v4

    .line 901
    goto :goto_1

    :cond_5
    move-object v2, v4

    .line 907
    goto :goto_3

    :cond_6
    move-object v5, v4

    .line 910
    goto :goto_4

    :cond_7
    move-object v3, v4

    .line 913
    goto :goto_5

    .line 926
    :cond_8
    iget-object v0, p0, Lagb;->a:Lagf;

    if-eqz v0, :cond_9

    .line 927
    iget-object v0, p0, Lagb;->a:Lagf;

    invoke-interface {v0, p1}, Lagf;->a(Lagp;)V

    .line 929
    :cond_9
    return-void
.end method
