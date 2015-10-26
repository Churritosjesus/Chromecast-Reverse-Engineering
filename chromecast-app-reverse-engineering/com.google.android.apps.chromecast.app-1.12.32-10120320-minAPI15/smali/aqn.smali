.class final Laqn;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbtq;


# instance fields
.field private synthetic a:Laqm;


# direct methods
.method constructor <init>(Laqm;)V
    .locals 0

    .prologue
    .line 275
    iput-object p1, p0, Laqn;->a:Laqm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 13

    .prologue
    const/4 v12, 0x2

    const/4 v2, 0x0

    const/4 v11, 0x0

    const/4 v1, 0x1

    .line 278
    iget-object v0, p0, Laqn;->a:Laqm;

    iget-object v0, v0, Laqm;->a:Laqj;

    invoke-static {v0}, Laqj;->c(Laqj;)Lbtl;

    move-result-object v0

    invoke-virtual {v0}, Lbtl;->b()Lbtg;

    move-result-object v0

    .line 279
    if-eqz v0, :cond_6

    .line 1000
    iget-object v3, v0, Lbtg;->a:Lbth;

    .line 279
    if-eqz v3, :cond_6

    .line 280
    iget-object v3, p0, Laqn;->a:Laqm;

    iget-object v3, v3, Laqm;->a:Laqj;

    invoke-static {v3}, Laqj;->b(Laqj;)Laow;

    move-result-object v4

    .line 2000
    iget-object v5, v0, Lbtg;->a:Lbth;

    .line 280
    iget-object v0, p0, Laqn;->a:Laqm;

    iget-object v0, v0, Laqm;->a:Laqj;

    invoke-static {v0}, Laqj;->d(Laqj;)Landroid/content/Context;

    move-result-object v3

    .line 2320
    invoke-virtual {v4}, Laow;->o()Latu;

    move-result-object v6

    .line 3115
    const-string v0, "com.google.android.gms.cast.metadata.TITLE"

    invoke-virtual {v5, v0}, Lbth;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3116
    iget-object v7, v6, Latu;->f:Ljava/lang/String;

    invoke-static {v7, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_b

    .line 3117
    iput-object v0, v6, Latu;->f:Ljava/lang/String;

    move v0, v1

    .line 3121
    :goto_0
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 4000
    iget v8, v5, Lbth;->c:I

    .line 3122
    packed-switch v8, :pswitch_data_0

    .line 3154
    :cond_0
    :goto_1
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v3

    if-ge v3, v12, :cond_1

    iget-object v3, v6, Latu;->a:Ljava/lang/String;

    if-eqz v3, :cond_1

    iget-object v3, v6, Latu;->f:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 3155
    iget-object v3, v6, Latu;->a:Ljava/lang/String;

    invoke-interface {v7, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3158
    :cond_1
    const-string v3, "\n"

    invoke-static {v3, v7}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v3

    .line 3159
    iget-object v7, v6, Latu;->g:Ljava/lang/String;

    invoke-static {v3, v7}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_a

    .line 3160
    iput-object v3, v6, Latu;->g:Ljava/lang/String;

    move v3, v1

    .line 5000
    :goto_2
    iget-object v0, v5, Lbth;->a:Ljava/util/List;

    .line 3164
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 3165
    iget-object v0, v6, Latu;->h:Ljava/lang/String;

    if-eqz v0, :cond_2

    move v3, v1

    .line 3168
    :cond_2
    iput-object v11, v6, Latu;->h:Ljava/lang/String;

    .line 3178
    :cond_3
    :goto_3
    iget-object v0, v6, Latu;->b:Ljava/util/List;

    if-nez v0, :cond_4

    iget-object v0, v6, Latu;->c:Ljava/lang/String;

    if-nez v0, :cond_4

    iget-object v0, v6, Latu;->e:Ldbw;

    if-eqz v0, :cond_4

    iget-object v0, v6, Latu;->i:Ljava/lang/String;

    if-eqz v0, :cond_5

    :cond_4
    move v3, v1

    .line 3184
    :cond_5
    iput-object v11, v6, Latu;->b:Ljava/util/List;

    .line 3185
    iput-object v11, v6, Latu;->c:Ljava/lang/String;

    .line 3186
    iput-object v11, v6, Latu;->e:Ldbw;

    .line 3187
    iput-object v11, v6, Latu;->i:Ljava/lang/String;

    .line 2320
    if-eqz v3, :cond_6

    .line 2322
    invoke-virtual {v4}, Laow;->p()V

    .line 286
    :cond_6
    return-void

    .line 3124
    :pswitch_0
    const-string v3, "com.google.android.gms.cast.metadata.SUBTITLE"

    invoke-virtual {v5, v3}, Lbth;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 3125
    const-string v3, "com.google.android.gms.cast.metadata.SUBTITLE"

    invoke-virtual {v5, v3}, Lbth;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v7, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3127
    :cond_7
    const-string v3, "com.google.android.gms.cast.metadata.ARTIST"

    invoke-virtual {v5, v3}, Lbth;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 3128
    const-string v3, "com.google.android.gms.cast.metadata.ARTIST"

    invoke-virtual {v5, v3}, Lbth;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v7, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 3132
    :pswitch_1
    const-string v3, "com.google.android.gms.cast.metadata.SUBTITLE"

    invoke-virtual {v5, v3}, Lbth;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 3133
    const-string v3, "com.google.android.gms.cast.metadata.SUBTITLE"

    invoke-virtual {v5, v3}, Lbth;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v7, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 3137
    :pswitch_2
    const-string v8, "com.google.android.gms.cast.metadata.SERIES_TITLE"

    invoke-virtual {v5, v8}, Lbth;->a(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    const-string v8, "com.google.android.gms.cast.metadata.SEASON_NUMBER"

    .line 3138
    invoke-virtual {v5, v8}, Lbth;->a(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    const-string v8, "com.google.android.gms.cast.metadata.EPISODE_NUMBER"

    .line 3139
    invoke-virtual {v5, v8}, Lbth;->a(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 3140
    sget v8, Lb;->dR:I

    const/4 v9, 0x3

    new-array v9, v9, [Ljava/lang/Object;

    const-string v10, "com.google.android.gms.cast.metadata.SERIES_TITLE"

    .line 3141
    invoke-virtual {v5, v10}, Lbth;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    aput-object v10, v9, v2

    const-string v10, "com.google.android.gms.cast.metadata.SEASON_NUMBER"

    .line 3142
    invoke-virtual {v5, v10}, Lbth;->c(Ljava/lang/String;)I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v1

    const-string v10, "com.google.android.gms.cast.metadata.EPISODE_NUMBER"

    .line 3143
    invoke-virtual {v5, v10}, Lbth;->c(Ljava/lang/String;)I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v12

    .line 3140
    invoke-virtual {v3, v8, v9}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v7, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 3148
    :pswitch_3
    const-string v3, "com.google.android.gms.cast.metadata.ARTIST"

    invoke-virtual {v5, v3}, Lbth;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 3149
    const-string v3, "com.google.android.gms.cast.metadata.ARTIST"

    invoke-virtual {v5, v3}, Lbth;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v7, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 6000
    :cond_8
    iget-object v0, v5, Lbth;->a:Ljava/util/List;

    .line 3170
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/images/WebImage;

    .line 7000
    iget-object v0, v0, Lcom/google/android/gms/common/images/WebImage;->b:Landroid/net/Uri;

    .line 3171
    if-nez v0, :cond_9

    const-string v0, ""

    .line 3172
    :goto_4
    iget-object v2, v6, Latu;->h:Ljava/lang/String;

    invoke-static {v0, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 3173
    iput-object v0, v6, Latu;->h:Ljava/lang/String;

    move v3, v1

    .line 3174
    goto/16 :goto_3

    .line 3171
    :cond_9
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_a
    move v3, v0

    goto/16 :goto_2

    :cond_b
    move v0, v2

    goto/16 :goto_0

    .line 3122
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method
