.class final Laaw;
.super Landroid/widget/Filter;
.source "PG"


# instance fields
.field private synthetic a:Laav;


# direct methods
.method constructor <init>(Laav;)V
    .locals 0

    .prologue
    .line 226
    iput-object p1, p0, Laaw;->a:Laav;

    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

    return-void
.end method


# virtual methods
.method public final convertResultToString(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 4

    .prologue
    .line 340
    check-cast p1, Lacx;

    .line 5231
    iget-object v1, p1, Lacx;->c:Ljava/lang/String;

    .line 5235
    iget-object v0, p1, Lacx;->d:Ljava/lang/String;

    .line 343
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 346
    :cond_0
    :goto_0
    return-object v0

    :cond_1
    new-instance v2, Landroid/text/util/Rfc822Token;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v0, v3}, Landroid/text/util/Rfc822Token;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/text/util/Rfc822Token;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method protected final performFiltering(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 235
    new-instance v6, Landroid/widget/Filter$FilterResults;

    invoke-direct {v6}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 237
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 238
    iget-object v0, p0, Laaw;->a:Laav;

    .line 1920
    iput-object v1, v0, Laav;->h:Ljava/util/List;

    move-object v0, v6

    .line 306
    :goto_0
    return-object v0

    .line 243
    :cond_0
    iget-object v0, p0, Laaw;->a:Laav;

    invoke-static {v0}, Laav;->a(Laav;)Landroid/content/Context;

    move-result-object v0

    iget-object v2, p0, Laaw;->a:Laav;

    invoke-static {v2}, Laav;->b(Laav;)Ls;

    move-result-object v2

    invoke-static {v0, v2}, Labe;->a(Landroid/content/Context;Ls;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 248
    iget-object v0, p0, Laaw;->a:Laav;

    .line 2920
    iput-object v1, v0, Laav;->h:Ljava/util/List;

    move-object v0, v6

    .line 251
    goto :goto_0

    .line 264
    :cond_1
    :try_start_0
    iget-object v0, p0, Laaw;->a:Laav;

    iget-object v2, p0, Laaw;->a:Laav;

    iget v2, v2, Laav;->c:I

    const/4 v3, 0x0

    invoke-static {v0, p1, v2, v3}, Laav;->a(Laav;Ljava/lang/CharSequence;ILjava/lang/Long;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v7

    .line 267
    if-eqz v7, :cond_4

    .line 275
    :try_start_1
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 277
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 279
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 281
    :goto_1
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 284
    new-instance v0, Labd;

    const/4 v1, 0x0

    invoke-direct {v0, v7, v1}, Labd;-><init>(Landroid/database/Cursor;Ljava/lang/Long;)V

    const/4 v1, 0x1

    invoke-static {v0, v1, v2, v3, v4}, Laav;->b(Labd;ZLjava/util/LinkedHashMap;Ljava/util/List;Ljava/util/Set;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 302
    :catchall_0
    move-exception v0

    move-object v1, v7

    :goto_2
    if-eqz v1, :cond_2

    .line 303
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_2
    throw v0

    .line 290
    :cond_3
    :try_start_2
    iget-object v0, p0, Laaw;->a:Laav;

    invoke-static {v0, v2, v3}, Laav;->a(Laav;Ljava/util/LinkedHashMap;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 293
    iget-object v0, p0, Laaw;->a:Laav;

    .line 294
    invoke-virtual {v0, v4}, Laav;->a(Ljava/util/Set;)Ljava/util/List;

    move-result-object v5

    .line 296
    new-instance v0, Laax;

    invoke-direct/range {v0 .. v5}, Laax;-><init>(Ljava/util/List;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/Set;Ljava/util/List;)V

    iput-object v0, v6, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 299
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    iput v0, v6, Landroid/widget/Filter$FilterResults;->count:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 302
    :cond_4
    if-eqz v7, :cond_5

    .line 303
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    :cond_5
    move-object v0, v6

    .line 306
    goto :goto_0

    .line 302
    :catchall_1
    move-exception v0

    goto :goto_2
.end method

.method protected final publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
    .locals 7

    .prologue
    .line 311
    iget-object v0, p0, Laaw;->a:Laav;

    iput-object p1, v0, Laav;->j:Ljava/lang/CharSequence;

    .line 313
    iget-object v0, p0, Laaw;->a:Laav;

    .line 3920
    const/4 v1, 0x0

    iput-object v1, v0, Laav;->h:Ljava/util/List;

    .line 315
    iget-object v0, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    if-eqz v0, :cond_4

    .line 316
    iget-object v0, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    check-cast v0, Laax;

    .line 317
    iget-object v1, p0, Laaw;->a:Laav;

    iget-object v2, v0, Laax;->b:Ljava/util/LinkedHashMap;

    invoke-static {v1, v2}, Laav;->a(Laav;Ljava/util/LinkedHashMap;)Ljava/util/LinkedHashMap;

    .line 318
    iget-object v1, p0, Laaw;->a:Laav;

    iget-object v2, v0, Laax;->c:Ljava/util/List;

    invoke-static {v1, v2}, Laav;->a(Laav;Ljava/util/List;)Ljava/util/List;

    .line 319
    iget-object v1, p0, Laaw;->a:Laav;

    iget-object v2, v0, Laax;->d:Ljava/util/Set;

    invoke-static {v1, v2}, Laav;->a(Laav;Ljava/util/Set;)Ljava/util/Set;

    .line 321
    iget-object v2, p0, Laaw;->a:Laav;

    iget-object v1, v0, Laax;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    iget-object v1, v0, Laax;->e:Ljava/util/List;

    if-nez v1, :cond_1

    .line 322
    const/4 v1, 0x0

    .line 321
    :goto_0
    invoke-virtual {v2, v3, v1}, Laav;->a(II)V

    .line 325
    iget-object v1, p0, Laaw;->a:Laav;

    iget-object v2, v0, Laax;->a:Ljava/util/List;

    invoke-virtual {v1, v2}, Laav;->a(Ljava/util/List;)V

    .line 328
    iget-object v1, v0, Laax;->e:Ljava/util/List;

    if-eqz v1, :cond_3

    .line 329
    iget-object v1, p0, Laaw;->a:Laav;

    iget v1, v1, Laav;->c:I

    iget-object v2, v0, Laax;->d:Ljava/util/Set;

    .line 330
    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v2

    sub-int v2, v1, v2

    .line 331
    iget-object v3, p0, Laaw;->a:Laav;

    iget-object v4, v0, Laax;->e:Ljava/util/List;

    .line 4770
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    .line 4772
    const/4 v0, 0x1

    move v1, v0

    :goto_1
    if-ge v1, v5, :cond_2

    .line 4773
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Labb;

    .line 4775
    iget-object v6, v0, Labb;->e:Laaz;

    if-nez v6, :cond_0

    .line 4776
    new-instance v6, Laaz;

    invoke-direct {v6, v3, v0}, Laaz;-><init>(Laav;Labb;)V

    iput-object v6, v0, Labb;->e:Laaz;

    .line 4778
    :cond_0
    iget-object v6, v0, Labb;->e:Laaz;

    invoke-virtual {v6, v2}, Laaz;->a(I)V

    .line 4779
    iget-object v0, v0, Labb;->e:Laaz;

    invoke-virtual {v0, p1}, Laaz;->filter(Ljava/lang/CharSequence;)V

    .line 4772
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 323
    :cond_1
    iget-object v1, v0, Laax;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    goto :goto_0

    .line 4784
    :cond_2
    add-int/lit8 v0, v5, -0x1

    iput v0, v3, Laav;->i:I

    .line 4785
    iget-object v0, v3, Laav;->l:Laay;

    invoke-virtual {v0}, Laay;->a()V

    .line 336
    :cond_3
    :goto_2
    return-void

    .line 334
    :cond_4
    iget-object v0, p0, Laaw;->a:Laav;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Laav;->a(Ljava/util/List;)V

    goto :goto_2
.end method
